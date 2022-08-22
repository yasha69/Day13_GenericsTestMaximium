package Day13GenericTestMaximium;

public class MaximiumNum {
    public static void main(String[] args) {
        System.out.println("Welcome to Generic Program.");
        Float x = 11.2f, y = 11.8f, z = 11.6f;

        testMaximum(x, y, z); 	}
    private static void testMaximum(Float x, Float y, Float z) {
        Float max = x;
        if (y.compareTo(x) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        System.out.println("Maximum num is:" + max);
    }
}
