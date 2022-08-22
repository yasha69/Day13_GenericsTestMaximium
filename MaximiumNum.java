package Day13GenericTestMaximium;

public class MaximiumNum {
    public static void main(String[] args) {
        System.out.println("Welcome to Generic Program.");
        Integer a = 10, b = 30, c =40;
        Float x = 11.2f, y = 11.8f, z = 11.6f;
        String j = "Cat", k = "Dog" , l = "Horse";

        MaximumNum.getMaximum(a, b, c);
        MaximumNum.getMaximum(x, y, z);
        MaximumNum.getMaximum(j, k, l);
    }

    private static <T extends Comparable> void getMaximum(T a, T b, T c) {
        T max = a;
        if (b.compareTo(a) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        System.out.println("Maximum :" + max);
    }
}

}
