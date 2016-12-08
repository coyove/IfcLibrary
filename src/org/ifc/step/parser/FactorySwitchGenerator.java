package org.ifc.step.parser;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by zezhong on 2016/12/7.
 */
public class FactorySwitchGenerator {
    private static String padSpaces(int level) {
        StringBuilder sb = new StringBuilder(64);
        for (int i = 0; i < level; i++) {
            sb.append("    ");
        }
        return sb.toString();
    }

    private static String translate(String name) {
        return ObjectFactory.createInstance(name).getClass().getSimpleName() + "()";
    }

    private static int hash2(String str, int a1, int a2) {
        char value[] = str.toCharArray();
        int h = 1;

        for (char aValue : value) {
            h = (h + aValue * (a1 / a2)) ^ a1;
        }

        return h;
    }

    private static boolean classExists(String n) {
        try {
            ObjectFactory.createInstance(n);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static void generate3() throws Exception {
        Pattern reg = Pattern.compile("nonInverseAttributes\\s=\\snew\\sString\\[\\]\\{\\S*\\}");
        Pattern reg2 = Pattern.compile("nonInverseHashAttributes\\s=\\snew\\sint\\[\\]\\{\\S*\\}");

        for (File file : new File("./src/org/ifc/ifc2x3tc1").listFiles()) {
            if (file.isFile()) {
                Path p = Paths.get("./src/org/ifc/ifc2x3tc1/" + file.getName());
                String classname = file.getName().substring(0, file.getName().length() - 5);

                List<String> lines = Files.readAllLines(p);
                String[] names = new String[]{};
                int originalLine = -1;
                int hashLine = -1;

                for (int i1 = 0; i1 < lines.size(); i1++) {
                    Matcher m = reg.matcher(lines.get(i1));
                    if (m.find()) {
                        String tmp = m.group();
                        names = tmp.substring(tmp.indexOf('{') + 1, tmp.lastIndexOf('}')).split(",");
                        for (int i2 = 0; i2 < names.length; i2++) {
                            names[i2] = names[i2].replace("\"", "");
                        }

                        originalLine = i1;
                    }

                    if (reg2.matcher(lines.get(i1)).find()) {
                        hashLine = i1;
                    }
                }

                if (names.length == 1 && names[0].isEmpty()) {
                    names = new String[0];
                }

                if (originalLine != -1) {
                    int[] hashes = new int[names.length];
                    for (int i = 0; i < names.length; i++) {
                        String name = names[i].toUpperCase();
                        if (name.contains("LIST<")) {
                            name = name.substring(name.indexOf("<") + 1, name.lastIndexOf(">"));
                            hashes[i] = ObjectFactory.hash(name) | ObjectFactory.LIST_TYPE;
                        } else if (name.contains("SET<")) {
                            name = name.substring(name.indexOf("<") + 1, name.lastIndexOf(">"));
                            hashes[i] = ObjectFactory.hash(name) | ObjectFactory.SET_TYPE;
                        } else {
                            if (!classExists(name)) {
                                hashes[i] = ObjectFactory.SKIP_TYPE;
                            } else {
                                hashes[i] = ObjectFactory.hash(name);
                            }
                        }
                    }

                    StringBuilder sb =
                            new StringBuilder("private static final int[] nonInverseHashAttributes = " +
                                    "new int[]{");
                    for (int i = 0; i < hashes.length; i++) {
                        sb.append(hashes[i]);
                        if (i < hashes.length - 1) {
                            sb.append(",");
                        }
                    }

                    sb.append("};");
                    sb.append("int[] getNonInverseHashAttributeTypes(){return nonInverseHashAttributes;}");

                    if (hashLine == -1) {
                        lines.add(originalLine + 1, sb.toString());
                    } else {
                        lines.set(hashLine, sb.toString());
                    }

                    Files.write(p, lines);
                }
            }
        }
    }

    public static void generate2() {
        TreeMap<Integer, String> map = new TreeMap<Integer, String>();
        int d = 0;
        for (Map.Entry<String, ObjectFactory.ClassBuilder> c : ObjectFactory.FACTORY_MAP.entrySet()) {
            int k = ObjectFactory.hash(c.getKey());
            if (map.containsKey(k)) {
                d++;
            } else {
                map.put(k, c.getKey());
            }
        }

        for (Map.Entry<Integer, String> e : map.entrySet()) {
            System.out.println("FACTORY_ARRAY[" + (e.getKey() - map.firstKey()) + "] = new " +
                    ObjectFactory.createInstance(e.getValue()).getClass().getSimpleName() +
            "Builder();");
        }

        System.out.println(map.firstKey());
    }

    public static void generate() throws Exception {
        Set<String> names = ObjectFactory.FACTORY_MAP.keySet();

        Map<Integer, Set<String>> lengths = new HashMap<Integer, Set<String>>();

        for (String s : names) {
            int l = s.length();
            if (!lengths.containsKey(l)) {
                lengths.put(l, new HashSet<String>());
            }

            lengths.get(l).add(s);
        }

        StringBuilder sb = new StringBuilder("package org.ifc.step.parser;\n" +
                "import org.ifc.ifc2x3tc1.*;" +
                "public class ObjectFactorySwitch {\n" +
                "public static Object createInstance(String str) {\n" +
                "switch (str.length()){\n");

        for (Map.Entry<Integer, Set<String>> n : lengths.entrySet()) {
            sb.append("    case " + n.getKey() + ":\n");
            sb.append(iter(n.getValue(), 0, 2));
        }
        sb.append("    default: return null;\n" +
                "}\n" +
                "}\n" +
                "}");

        OutputStream os = new FileOutputStream("src/org/ifc/step/parser/ObjectFactorySwitch.java");
        os.write(sb.toString().getBytes());
        os.close();
    }

    private static String iter(Set<String> names, int level, int pad) throws Exception {
        String padder = padSpaces(pad);

        if (names.size() == 0) {
            return padder + "return null;";
        }

        if (names.size() == 1) {
            return padder + "return new " + translate(names.iterator().next()) + ";\n";
        }

        Map<Character, Set<String>> lead = new HashMap<Character, Set<String>>();

        for (String s : names) {
            if (s.length() <= level) {
                for (String name : names) {
                    System.out.println(name);
                }
                throw new Exception();
            } else {
                Character c = s.charAt(level);
                if (!lead.containsKey(c)) {
                    lead.put(c, new HashSet<String>());
                }

                lead.get(c).add(s);
            }
        }

        if (lead.size() == 1) {
            return iter(names, level + 1, pad);
        } else {
            StringBuilder sb = new StringBuilder(padder + "switch (str.charAt(" + level + ")){\n");
            for (Map.Entry<Character, Set<String>> c : lead.entrySet()) {
                sb.append(padder + "    case '" + c.getKey() + "': ");
                if (c.getValue().size() == 1) {
                    sb.append("return new " + translate(c.getValue().iterator().next()) + ";\n");
                } else {
                    sb.append("\n" + iter(c.getValue(), level + 1, pad + 2));
                }
            }

            sb.append(padder + "    default: return null;\n");
            sb.append(padder + "}\n");

            return sb.toString();
        }
    }
}
