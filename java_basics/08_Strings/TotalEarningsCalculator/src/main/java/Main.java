public class Main {

  public static void main(String[] args) {

    //String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
    String text = "Вася заработал 50000 рублей, Петя - 75635 рубля, а Маша - 35000 рублей";

        int vasya = text.indexOf ( "Вася заработал" );
        int vasya2 = text.indexOf ( "руб" );
        int petya = text.indexOf ( "Петя -" );
        int petya2 = text.lastIndexOf ( "руб" );
        int masha = text.indexOf ( "Маша -" );
        int masha2 = text.lastIndexOf ( "руб" );
        String str1 = text.substring ( vasya + 14, vasya2 ).trim ();
        String str2 = text.substring ( petya + 6, petya2 - 22 ).trim ();
        String str3 = text.substring ( masha + 6, masha2 ).trim ();
        int summ = Integer.parseInt ( str1 ) + Integer.parseInt ( str2 ) + Integer.parseInt ( str3 );
        System.out.println ( summ );

    //TODO: напишите ваш код, результат вывести в консоль
  }

}
