
import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();
        fruits.add("банан");        fruits.add("яблоко");
        fruits.add("мандарин");     fruits.add("банан");
        fruits.add("манго");        fruits.add("яблоко");
        fruits.add("груша");        fruits.add("дыня");
        fruits.add("банан");        fruits.add("апельсин");
        fruits.add("апельсин");     fruits.add("киви");

        Set<String> uniqueFruits = new HashSet<>(fruits);
        List<String> countFruits = new ArrayList<>(uniqueFruits);

        System.out.println("\n" + "Задание №1 фрукты:");
        for (int i = 0; i < uniqueFruits.size(); i++) {
            System.out.println("Фрукт: " + countFruits.get(i) + ". Количество: "+ Collections.frequency(fruits, countFruits.get(i)));
        }

        System.out.println("\n" + "Задание №2 телефонная книга:");
        PhoneBook phonebook = new PhoneBook();
        phonebook.add("Петров", "+375(29)415-11-10");
        phonebook.add("Петров", "+375(33)315-10-15");
        phonebook.add("Сидоров", "+375(44)515-12-20");
        phonebook.add("Сидоров", "+375(44)615-13-30");
        phonebook.add("Котиков", "+375(25)715-14-40");

        System.out.println(phonebook.get("Петров"));
        System.out.println(phonebook.get("Сидоров"));
        System.out.println(phonebook.get("Котиков"));
    }
}