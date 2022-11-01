import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static final String WRONG_EMAIL_ANSWER = "Неверный формат email";
    private static EmailList emailList = new EmailList();

    /* TODO:
        Пример вывода списка Email, после ввода команды LIST в консоль:
        test@test.com
        hello@mail.ru
        - каждый адрес с новой строки
        - список должен быть отсортирован по алфавиту
        - email в разных регистрах считается одинаковыми
           hello@skillbox.ru == HeLLO@SKILLbox.RU
        - вывод на печать должен быть в нижнем регистре
           hello@skillbox.ru
        Пример вывода сообщения об ошибке при неверном формате Email:
        "Неверный формат email"
    */

    public static void main(String[] args) {

       while (true) {
           Scanner scanner = new Scanner(System.in);
           String input = scanner.nextLine();
           switch (input.split(" ")[0]) {
               case "ADD":  if (input.matches("ADD\\s\\w+@[a-zA-Z_]+?\\.[a-zA-Z]{2,6}"))
                   emailList.add(input.replaceAll("ADD","").trim());
               else System.out.println(WRONG_EMAIL_ANSWER);
                   break;
               case "LIST": emailList.getSortedEmails();
                   break;
               default:
                   System.out.println("Введите адрес электронной почты");
           }
           }
            //TODO: write code here
        }
    }
