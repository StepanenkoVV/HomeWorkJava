import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArray {

    //TODO: Напишите код, который меняет порядок расположения элементов внутри массива на обратный.
    public static String[] reverse(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            System.out.println();
        }
        int n = strings.length; //
        String tempt;
        for (int i = 0; i < n / 2; i++) {
            tempt = strings[n - i - 1];
            strings[n - i - 1] = strings[i];
            strings[i] = tempt;
        }
        return strings;
    }
}
