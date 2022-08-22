package Day13GenericTestMaximium;

public class MaximiumNum {
    public static void main(String[] args) {
        System.out.println("Welcome to Generic Program.");
        Integer a = 10, b = 30, c =40;
        testMaximum (a,b,c);
    }
    private static void testMaximum(Integer a, Integer b, Integer c) {
        Integer max = a;
        if (b.compareTo(a) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        System.out.println("Maximum num is:" + max);
    }
}