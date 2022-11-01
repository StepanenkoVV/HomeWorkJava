import java.util.*;


public class PhoneBook {
    public static final Map<String, String> myPhoneBook = new HashMap<>();
    public final String NUMBER_VALIDATION = "[0-9]+";
    public final  String NAME_VALIDATION = "[а-яА-Я]+";
    public final String EMTY_LINE = "";

    public void addContact(String name, String phone) {
        // проверьте корректность формата имени и телефона
        // если такой номер уже есть в списке, то перезаписать имя абонента
        String emtyLine = "";
        if (name.matches(NAME_VALIDATION) && phone.equals(EMTY_LINE)) {
            System.out.println("Передана пустая строка в номере абонента");
            return;
        } else if (name.equals(EMTY_LINE) && phone.matches(NUMBER_VALIDATION)){
            System.out.println("Передана пустая строка в номере абонента");
            return;
        }

        if (name.matches(NAME_VALIDATION) && phone.matches(NUMBER_VALIDATION)) {
            if (myPhoneBook.containsKey(name) && !myPhoneBook.containsValue(phone))
            emtyLine = myPhoneBook.get(name) + "," + emtyLine;
           myPhoneBook.put(name,emtyLine);
        }
        emtyLine = emtyLine + phone;
        myPhoneBook.put(name,emtyLine);
        System.out.println("Контакт сохранен!");
    }


    public String getNameByPhone(String phone) {
        String strPhone = ""; //
        // формат одного контакта "Имя - Телефон"
        // если контакт не найдены - вернуть пустую строку
        if (myPhoneBook.containsValue(phone)){
        for (Map.Entry entry : myPhoneBook.entrySet()) {
            strPhone = entry.getKey() + " - " + phone;
        }
        }
        return strPhone;
    }

    public Set<String> getPhonesByName(String name) {
        Set<String> setName = new TreeSet<>();
        // формат одного контакта "Имя - Телефон"
        // если контакт не найден - вернуть пустой TreeSet
        for (Map.Entry<String,String> entry: myPhoneBook.entrySet())
            if (entry.getKey().equals(name)){
                setName.add(name + " - " + entry.getValue());
                System.out.println(setName);
            }
        return setName;
    }

    public Set<String> getAllContacts() {
        // формат одного контакта "Имя - Телефон"
        // если контактов нет в телефонной книге - вернуть пустой TreeSet
        Set<String> set = new TreeSet<>();
        for (Map.Entry<String,String> entry : myPhoneBook.entrySet()) {
            set.add(entry.getKey() + " - " + entry.getValue());
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        if (set.isEmpty()){
            System.out.println(set);
        }
        return set;
    }

}