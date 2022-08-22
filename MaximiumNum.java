package Day13GenericTestMaximium;

  public class MaximumNum <T extends Comparable>{
        T var1, var2, var3;
        public MaximumNum(T var1, T var2, T var3) {
            this.var1 = var1;
            this.var2 = var2;
            this.var3 = var3;
        }
        public static void main(String[] args) {
            System.out.println("Welcome to Generic Program.");
            Integer a = 10, b = 30, c =40;
            Float x = 11.2f, y = 11.8f, z = 11.6f;
            String j = "Cat", k = "Dog" , l = "Horse";

            new MaximumNum<>(a, b, c).max();
            new MaximumNum<>(x, y, z).max();
            new MaximumNum<>(j, k, l).max();
        }

        private void max() {
            // TODO Auto-generated method stub
            MaximumNum.getMaximum(var1, var2, var3);
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
