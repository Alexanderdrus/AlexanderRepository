package JAVA2.DOM3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class App {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Alexander");
        names.add("Mike");
        names.add("Alexander");
        names.add("Dmitriy");
        names.add("Vasiliy");
        names.add("Vasiliy");
        names.add("Egor");
        names.add("Mike");
        names.add("Vladimir");
        names.add("Vyacheslav");
        names.add("Egor");
        names.add("Georg");
        names.add("Egor");
        names.add("Fred");

        System.out.println(names);

        HashSet<String> unames = new HashSet<>(names);
        System.out.println(unames);

        Map<String, Integer> namesCount = new HashMap<>();
        for (String s : names) {
            namesCount.put(s, namesCount.getOrDefault(s, 0) + 1);
        }
        namesCount.entrySet().forEach(System.out::println);
        System.out.println();
        Phonebook phonebook = new Phonebook();

        phonebook.add("Dmitriev","8 312 345 67 54");
        phonebook.add("Dmitriev","8 923 445 66 74");
        phonebook.add("Ivanov","8 912 345 03 44");
        phonebook.add("Zakharov","8 912 222 44 34");
        phonebook.add("Egorov","8 912 345 75 34");
        phonebook.add("Zakharov","8 912 345 74 11");

        System.out.println(phonebook.get("Dmitriev"));





    }
}
