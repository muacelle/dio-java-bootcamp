package map;

// Map is just a set with key-value pairs.
// Map (Interface) -> HashMap (Class).

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<String, Integer> empIds = new HashMap<>();

        empIds.put("John", 1234);
        empIds.put("Charlotte", 4324);
        empIds.put("Jerry", 7844);

        System.out.println(empIds.get("John")); // 1234
        System.out.println(empIds.containsKey("Jerry")); // true
        System.out.println(empIds.containsValue(9999)); // false

        empIds.put("Sally", 6776);
        empIds.replace("Sally", 7777);

        empIds.replace("Carl", 8901); // nothing happens
        empIds.putIfAbsent("John", 2222); // only put if there is no "John" in the map

        empIds.remove("Sally");

    }
}
