import java.util.List;
import java.util.stream.Stream;

public class ParseInt {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,-1,-5);
        int sum = list.stream().mapToInt(Integer::intValue).filter(i -> i > 0).sum();
        System.out.println(sum );
    }
}
