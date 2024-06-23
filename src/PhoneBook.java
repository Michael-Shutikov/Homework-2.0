
import java.util.*;

public class PhoneBook {

    Map<String, List<String>> phonebook = new HashMap<>();

    public void add(String lastName, String number) {
        List<String> numbers = phonebook.getOrDefault(lastName, new ArrayList<>());
        phonebook.put(lastName, numbers);
        numbers.add(number);
    }

    public List<String> get(String lastName) {
        System.out.println(lastName + ": ");
        return phonebook.get(lastName);
    }
}