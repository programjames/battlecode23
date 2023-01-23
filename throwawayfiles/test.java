public class test {

    public static final long MAGIC_NUMBER = 0x1ff788ce4e5fe060l;
    public static void main(String args[]) {
        System.out.println(fastSQRT(1.96));
    }

    private static double fastSQRT(double x) {
        return Double.longBitsToDouble(MAGIC_NUMBER + Double.doubleToRawLongBits(x) / 2);
    }
}
