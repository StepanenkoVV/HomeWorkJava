import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class CustomerStorage {
    private final Map<String, Customer> storage;

    public CustomerStorage() {
        storage = new HashMap<>();
    }

    public void addCustomer(String data) {
        final int INDEX_NAME = 0;
        final int INDEX_SURNAME = 1;
        final int INDEX_EMAIL = 2;
        final int INDEX_PHONE = 3;


        final String phoneMatches = "^((\\+7|7|8)+([0-9]){10})$";
        final String emailMatches = "^[-\\w.]+@([A-z0-9][-A-z0-9]+\\.)+[A-z]{2,4}$";


        String[] components = data.split("\\s+");
        String name = components[INDEX_NAME] + " " + components[INDEX_SURNAME];

        if (components.length != 4)
            throw new IllegalArgumentException("something is missing");
        if (!components[INDEX_EMAIL].matches(emailMatches))
            throw new IllegalArgumentException("mail is not correct");
        if (!components[INDEX_PHONE].matches(phoneMatches))
            throw new IllegalArgumentException("phone is not correct");

        storage.put(name, new Customer(name, components[INDEX_PHONE], components[INDEX_EMAIL]));


    }

    public void listCustomers() {
        storage.values().forEach(System.out::println);
    }

    public void removeCustomer(String name) {
        storage.remove(name);
    }

    public Customer getCustomer(String name) {
        return storage.get(name);
    }

    public int getCount() {
        return storage.size();
    }
}
