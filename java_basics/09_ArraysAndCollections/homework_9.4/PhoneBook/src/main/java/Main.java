import java.util.*;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        while (true) {
            System.out.println("\nВведите номер, имя или команду\t");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            if (input.equals("LIST")) {
                phoneBook.getAllContacts();
                break;
            }
            if (input.matches(phoneBook.NAME_VALIDATION)) {
                if (phoneBook.myPhoneBook.containsKey(input)) { //поиск контакта по имени
                    System.out.println("Данный контакт уже есть в телефонной книге " + phoneBook.getPhonesByName(input));
                    phoneBook.addContact(phoneBook.getNameByPhone(input), phoneBook.myPhoneBook.get(input));

                } else if (!phoneBook.myPhoneBook.containsKey(input)) {
                    System.out.println("Такого имени нет в телефонной книге ");
                }
                if (input.equals(phoneBook.EMTY_LINE )){
                    System.out.println("Передано пустая строка в Имени абонента");
                    continue;
                }
                System.out.println("Введите номер телефона для абонента " + input.trim());
                String phoneInput = scanner.nextLine();
                phoneBook.addContact(input, phoneInput);
                continue;
            } else if (input.matches(phoneBook.NUMBER_VALIDATION)) {
                if (!phoneBook.myPhoneBook.containsValue(input)) {
                    System.out.println("Такого номера нет в телефонной книге");
                    System.out.println("Введите имя абонента для номера " + input);
                    String keyName = scanner.nextLine();
                    phoneBook.addContact(keyName, input);
                    continue;
                } else if (phoneBook.myPhoneBook.containsValue(input)) { //поиск контакта по номеру
                    System.out.println("Данный контакт уже есть в телефонной книге " + phoneBook.getNameByPhone(input));
                    continue;
                }    if (input.equals(phoneBook.EMTY_LINE )){
                    System.out.println("Передано пустая строка в номере абонента");
                    continue;
                }
            }
            else {
                System.out.println("Неверный формат ввода");
            }
        }
    }
}
