import java.util.*;

public class EmailList {
    ArrayList<String> addEmail = new ArrayList<>();

    public void add(String email) {
        email = email.toLowerCase(Locale.ROOT);
        if (email.matches("\\w+@[a-zA-Z_]+?\\.[A-Za-z]{2,6}"))
        {   addEmail.add(email);
            System.out.println(email);
        }

        // TODO: валидный формат email добавляется
    }

    public List<String> getSortedEmails() {
        // TODO: возвращается список электронных адресов в алфавитном порядке
        TreeSet<String> setOfEmail = new TreeSet<>(addEmail);
        for (String words: setOfEmail) {
            System.out.println(words);
        }
        return new ArrayList<>(setOfEmail);
        //return Collections.emptyList();
    }


}
