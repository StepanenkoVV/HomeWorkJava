import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    while (true) {
      String input = scanner.nextLine();
      if (input.equals("0")) {
        break;
      }
      if (!input.matches("[а-яА-Я -]+")){
        System.out.println("Введенная строка не является ФИО");
        break;
      }
      if (input.split(" ").length !=3){
        System.out.println("Введенная строка не является ФИО");
        break;
      }
      String fam = input.substring(0, input.indexOf(" "));
      String otch = input.substring(input.lastIndexOf(" ")).trim();
      String imya = input.substring(input.indexOf(" "), input.lastIndexOf(" ")).trim();
      System.out.printf("Фамилия: %s%nИмя: %s%nОтчество: %s",fam,imya,otch);

      //TODO:напишите ваш код тут, результат вывести в консоль.
      //При невалидном ФИО вывести в консоль: Введенная строка не является ФИО
    }
  }

}