import static java.lang.Integer.parseInt;
import static java.lang.Integer.valueOf;

public class Main {

  public static void main(String[] args) {
    Container container = new Container();
    container.count += 7843;
    int sum = sumDigits(7843);
    System.out.println(sum);
  }




  public static int sumDigits(Integer number) {
    //@TODO: write code here and delete TODO line
    if (number==null){
      return -1;
    }
    int sumNumber = 0;
    String stringNumber = number.toString();
    int lenghtNumber = stringNumber.length();
    for (int i = 0; i < lenghtNumber; i++) {
      sumNumber += Character.getNumericValue(stringNumber.charAt(i));
    }
    return sumNumber ;
  }
}


 /* Реализуйте метод sumDigits который возвращает сумму цифр числа, пример:
  передано 12345, метод должен вернуть 15
  если передано null, то должен вернуть -1

  Запустите тесты TestSumDigits для проверки корректности работы метода

  не меняйте название метода, его возвращаемое значение и модификаторы доступа (public).
  В противном случае тестовый метод не сможет проверить ваш код
   */
