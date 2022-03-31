package JAVA2.DOM3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Phonebook {
    private Map<String, HashSet<String>> map;

    Phonebook(){
        this.map= new HashMap<>();
    }

    void add(String surname,String phone) {
        HashSet<String> numbers;
        if (map.containsKey(surname)){
            numbers=map.get(surname);
        }
        else {
            numbers=new HashSet<>();
        }
        numbers.add(phone);
        map.put(surname,numbers);

    }

    Set<String> get(String surname){
        return map.get(surname);
    }
}
