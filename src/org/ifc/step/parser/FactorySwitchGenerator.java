package org.ifc.step.parser;

import org.ifc.ifc2x3tc1.INTEGER;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.lang.instrument.Instrumentation;
import java.util.*;

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
        return ObjectFactoryMap.createInstance(name).getClass().getSimpleName() + "()";
    }

    private static int hash(String str, int b) {
        char value[] = str.toCharArray();
        int h = 0;

        for (int i = 0; i < value.length; i++) {
            h = (h + value[i] * (b / 8)) ^ b;
            // 2: -474 -2 59675
            // 8: -812 -4 38226
            // 4: -716 -2 52007
            // 5: -877 -3 43466
        }

        return h;
    }

    private static int hash2(String str, int a1, int a2) {
        char value[] = str.toCharArray();
        int h = 1;

        for (int i = 0; i < value.length; i++) {
            h = (h + value[i] * (a1 / a2)) ^ a1;

        }

        return h;
    }

    private static long[] testhash(Set<String> names, int b) {
        Set<Integer> hashes = new HashSet<Integer>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (String name : names) {
            int h = hash(name, b);
            if (h > max) max = h;
            if (h < min) min = h;

            hashes.add(h);
        }

        return new long[]{hashes.size() - names.size(), (long) max - (long) min};
    }

    private static long[] testhash2(Set<String> names, int a1, int a2) {
        Set<Integer> hashes = new HashSet<Integer>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (String name : names) {
            int h = hash2(name, a1, a2);
            if (h > max) max = h;
            if (h < min) min = h;

            hashes.add(h);
        }

        return new long[]{hashes.size() - names.size(), (long) max - (long) min};
    }

    public static void generate() throws Exception {
        Set<String> names = ObjectFactoryMap.FACTORY_MAP.keySet();

//        for (int i1 = -10000; i1 < Integer.MAX_VALUE; i1++) {
//            long[] w = testhash(names, i1);
//            if (Math.abs(w[0]) < 5 && Math.abs(w[1]) < 70000) {
//                System.out.println(i1 + " " + w[0] + " " + w[1]);
//            }
//        }
        for (int i1 = -10000; i1 < Integer.MAX_VALUE; i1++) {
            for (int j1 = 1; j1 < 33; j1++) {
                long[] w = testhash2(names, i1, j1);
                if (Math.abs(w[1]) < 30000) {
                    System.out.println(i1 + " " + j1 + " " + w[0] + " " + w[1]);
                    break;
                }
            }
        }

        if (1 == 1) return;

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
