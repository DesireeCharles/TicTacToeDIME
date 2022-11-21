package info.scce.dime.common;

public class CommonNativeIntegerServiceLibrary {

    public static long add(long a, long b) throws ArithmeticException {
        return Math.addExact(a, b);
    }

    public static long subtract(long a, long b) throws ArithmeticException {
        return Math.subtractExact(a, b);
    }

    public static long multiply(long a, long b) throws ArithmeticException {
        return Math.multiplyExact(a, b);
    }

    public static long divide(long a, long b) throws ArithmeticException {
        return a / b;
    }

    public static long mod(long a, long b) throws ArithmeticException {
        return a % b;
    }

    public static boolean less(long a, long b) {
        return a < b;
    }

    public static boolean lessOrEquals(long a, long b) {
        return a <= b;
    }

    public static boolean equals(long a, long b) {
        return a == b;
    }

    public static boolean greaterOrEquals(long a, long b) {
        return a >= b;
    }

    public static boolean greater(long a, long b) {
        return a > b;
    }

    public static double toReal(long a) {
        return (double) a;
    }

    public static String toString(long a){
        return Long.toString(a);
    }

}

