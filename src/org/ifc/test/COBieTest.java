package org.ifc.test;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;
import org.ifc.ifcmodel.IfcModel;
import org.ifc.toolkit.Planning;
import org.ifc.toolkit.base.Element;
import org.ifc.toolkit.element.Storey;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by coyove on 2017/4/14.
 */
public class COBieTest {
    public static String currentDate() {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        return df.format(new Date());
    }

    public static void main(String[] args) throws Exception {
        IfcModel model = new IfcModel();
        long start = System.currentTimeMillis();
        model.readStepFile(new FileInputStream("C:\\Users\\coyove\\Dropbox\\ifc\\main.ifc"));
        System.out.println(model.getIfcObjects().size());
        System.out.println(System.currentTimeMillis() - start);

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Floor");

        int r = 0;
        Row row = sheet.createRow(0);
        Cell cell;
        for (String s : new String[]{
                "Name", "CreatedBy", "CreatedOn", "Category",
                "ExtSystem", "ExtObject", "ExtIdentifier", "Description", "Elevation", "Height",
        }) {
            cell = row.createCell(r++);
            cell.setCellStyle(COBieColor.newCellStyle(workbook, COBieColor.Legend.HEADER));
            cell.setCellValue(s);
        }

        r = 1;
        List<Element> results = Planning.from(model).select(Storey.class).toList();
        TreeMap<Double, Storey> sorting = new TreeMap<>();
        Map<Storey, Double> heights = new HashMap<>();

        for (Element elm : results) {
            sorting.put(((Storey) elm).getElevation(), (Storey) elm);
        }

        Iterator<Map.Entry<Double, Storey>> iter = sorting.entrySet().iterator();
        Map.Entry<Double, Storey> firstFloor = iter.next();
        while (iter.hasNext()) {
            Map.Entry<Double, Storey> tmp = iter.next();
            heights.put(firstFloor.getValue(), tmp.getKey() - firstFloor.getKey());
            firstFloor = tmp;
        }
        heights.put(firstFloor.getValue(), 0.0);

        for (Element elm : results) {
            Storey s = (Storey) elm;
            row = sheet.createRow(r++);

            cell = row.createCell(0);
            cell.setCellStyle(COBieColor.newCellStyle(workbook, COBieColor.Legend.REQUIRED));
            cell.setCellValue(s.getName());

            cell = row.createCell(1);
            cell.setCellStyle(COBieColor.newCellStyle(workbook, COBieColor.Legend.INTERNAL_REFERENCE));
            cell.setCellValue("zzz");

            cell = row.createCell(2);
            cell.setCellStyle(COBieColor.newCellStyle(workbook, COBieColor.Legend.REQUIRED));
            cell.setCellValue(currentDate());

            cell = row.createCell(3);
            cell.setCellStyle(COBieColor.newCellStyle(workbook, COBieColor.Legend.INTERNAL_REFERENCE));
            cell.setCellValue("Floor");

            cell = row.createCell(4);
            cell.setCellStyle(COBieColor.newCellStyle(workbook, COBieColor.Legend.EXTERNAL_REFERENCE));
            cell.setCellValue("Autodesk");

            cell = row.createCell(5);
            cell.setCellStyle(COBieColor.newCellStyle(workbook, COBieColor.Legend.EXTERNAL_REFERENCE));
            cell.setCellValue("樓層");

            cell = row.createCell(6);
            cell.setCellStyle(COBieColor.newCellStyle(workbook, COBieColor.Legend.EXTERNAL_REFERENCE));
            cell.setCellValue("");

            cell = row.createCell(7);
            cell.setCellStyle(COBieColor.newCellStyle(workbook, COBieColor.Legend.SPECIFIED_REQUIRED));
            cell.setCellValue(s.getDescription());

            cell = row.createCell(8);
            cell.setCellStyle(COBieColor.newCellStyle(workbook, COBieColor.Legend.SPECIFIED_REQUIRED));
            cell.setCellValue(s.getElevation());

            cell = row.createCell(9);
            cell.setCellStyle(COBieColor.newCellStyle(workbook, COBieColor.Legend.SPECIFIED_REQUIRED));
            cell.setCellValue(heights.get(s));
        }

//        for (int i = 0; i < 10; i++)
        sheet.setAutoFilter(new CellRangeAddress(0, results.size(), 0, 9));

        FileOutputStream outputStream = new FileOutputStream("cobie.xlsx");
        workbook.write(outputStream);
        workbook.close();

        System.out.println(System.currentTimeMillis() - start);
    }
}
