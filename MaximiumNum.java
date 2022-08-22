package Day13GenericTestMaximium;

public class MaximiumNum {
    public static void main(String[] args) {
        System.out.println("Welcome to Generic Program.");
        String j = "Cat", k = "Dog" , l = "Horse";
        testMaximum(j, k, l); 	}
    private static void testMaximum(String j,String k,String l) {
        String max = j;
        if (k.compareTo(j) > 0) {
            max = k;
        }
        if (l.compareTo(max) > 0) {
            max = l;
        }
        System.out.println("Maximum string is:" + max);
    }
}