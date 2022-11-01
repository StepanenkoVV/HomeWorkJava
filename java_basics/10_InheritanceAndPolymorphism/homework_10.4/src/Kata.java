public class Kata {

        public static int squareSum(int[] n)
  //For example, for [1, 2, 2] it should return 9 because 1^2 + 2^2 + 2^2 = 9.
        {
            int x =0;
            int b = 2;
           for (int s: n){
               x+= (int) Math.pow(s, b);

           }
        return x;
        }

    public static void main(String[] args) {
        System.out.println(squareSum(new int[] {3}));
    }
}
