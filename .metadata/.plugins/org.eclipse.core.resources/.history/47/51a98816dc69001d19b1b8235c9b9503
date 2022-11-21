package info.scce.dime.common;

import java.util.List;
import java.util.Arrays;

public class CommonNativeTextServiceLibrary {

    public static boolean equals(String a, String b) {
        return a.equals(b);
    }

    public static String append(String a, String b) {
        return a + " " + b;
    }

    public static String toLowercase(String a) {
        return a.toLowerCase();
    }

    public static boolean contains(String string, String needle) {
        return string.contains(needle);
    }

    public static String join(String prefix, String suffix, String infix){
        return prefix + infix + suffix;
    }

    public static String shorten(String a, long b){
        if (a.length() > b){
            return a.substring(0, (int) b);
        }
        else {
            return a;
        }
    }

    public static long length(String a) {
        return a.length();
    }

    public static boolean isNull(String a) {
        return (a == null);
    }

    public static List<String> split(String t, String splitter) {
           return Arrays.asList(t.split(splitter));
    }

}

