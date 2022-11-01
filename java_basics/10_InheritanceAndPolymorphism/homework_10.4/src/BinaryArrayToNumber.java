import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinaryArrayToNumber {
    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        int count = 0;

      for (Integer g: binary){

         //accumulator = (accumulator*2)+ ele // см. здесь, почему
          count = (count * 2 ) + g;

      }
        // Your Code
        return count;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,1, 1, 1);

        System.out.println(ConvertBinaryArrayToInt(numbers));
    }
}
