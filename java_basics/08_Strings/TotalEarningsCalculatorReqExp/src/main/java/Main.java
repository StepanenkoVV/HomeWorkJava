import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

  public static void main(String[] args) {
    //System.out.println(calculateSalarySum("Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей"));
    //System.out.println(calculateSalarySum("Коля заработал 50000 рублей, Федя - 45800 рубля, а Саша - 23000 рублей"));
    System.out.println(calculateSalarySum("Вася не работает, Петя студент, а Маша встречается с парнем который обеспечивает ее"));
    }


  public static int calculateSalarySum(String text){
    //TODO: реализуйте метод
    Pattern r = Pattern.compile("(\\d+)(\\d+)(\\d+)");
    Matcher m = r.matcher(text);
    int summ = 0;
    while (m.find()){
      summ+= Integer.parseInt(m.group());
    }
    if (summ ==0) {
      System.out.println("Никто ничего не заработал");
    }
    return summ;
  }

}
// String[] words = text.split("\\D++");
//    for (int i =0; i< words.length; i++){
//      System.out.println(words[i]);
//    }
//
//    System.out.println("Решение №2");
//    Pattern pattern = Pattern.compile("[0-9]+");
//    Matcher m = pattern.matcher(text);
//    String [] words1 = pattern.split(text);