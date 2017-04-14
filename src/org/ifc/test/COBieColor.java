package org.ifc.test;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFColor;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.extensions.XSSFCellBorder;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFont;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.impl.CTFontImpl;

import java.awt.*;
import java.awt.Color;

/**
 * Created by coyove on 2017/4/14.
 */
public class COBieColor {
    public enum Legend {
        REQUIRED,
        INTERNAL_REFERENCE,
        EXTERNAL_REFERENCE,
        SPECIFIED_REQUIRED,
        SECONDARY_INFORMATION,
        REGIONAL_OWNER_PRODUCT_SPECIFIC_DATA,
        NOT_USED,
        HEADER
    }

    public static XSSFCellStyle newCellStyle(XSSFWorkbook workbook, Legend color) {
        XSSFCellStyle style = workbook.createCellStyle();
        style.setFillPattern(FillPatternType.SOLID_FOREGROUND);

        Color bg = null;
        switch (color) {
            case REQUIRED:
                bg = new Color(255, 255, 153);
                break;
            case INTERNAL_REFERENCE:
                bg = new Color(255, 204, 153);
                break;
            case EXTERNAL_REFERENCE:
                bg = new Color(204, 153, 255);
                break;
            case SPECIFIED_REQUIRED:
                bg = new Color(204, 255, 204);
                break;
            case SECONDARY_INFORMATION:
                bg = new Color(192, 192, 192);
                break;
            case REGIONAL_OWNER_PRODUCT_SPECIFIC_DATA:
                bg = new Color(153, 204, 255);
                break;
            case NOT_USED:
                bg = Color.BLACK;
                break;
            case HEADER:
                bg = new Color(190, 190, 190);
                break;
        }

        XSSFColor clr = new XSSFColor(bg);
        style.setFillForegroundColor(clr);

        XSSFColor black = new XSSFColor(Color.BLACK);
        style.setBorderColor(XSSFCellBorder.BorderSide.BOTTOM, black);
        style.setBorderColor(XSSFCellBorder.BorderSide.TOP, black);
        style.setBorderColor(XSSFCellBorder.BorderSide.LEFT, black);
        style.setBorderColor(XSSFCellBorder.BorderSide.RIGHT, black);
        style.setBorderBottom(BorderStyle.THIN);
        style.setBorderTop(BorderStyle.THIN);
        style.setBorderLeft(BorderStyle.THIN);
        style.setBorderRight(BorderStyle.THIN);

        XSSFFont font = workbook.createFont();
        font.setFontName("Arial");
        if (color == Legend.HEADER) {
            style.setAlignment(HorizontalAlignment.CENTER);
            style.setRotation((short) 90);

            font.setBold(true);
            font.setFontHeight(8);
        } else {
            font.setFontHeight(10);
        }
        style.setFont(font);

        return style;
    }
}
