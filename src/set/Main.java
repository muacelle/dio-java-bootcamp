package set;

// Set is a way you can group a bunch of alike objects togheter and handle them as a unit.
/* Set vs List = Lists mantains the order and can sort the list whatever way you want, Sets don't.
Set do not allow duplicates.
*/
// Set (Interface) -> HashSet (Class).

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<String> names = new HashSet<>();

        names.add("Walter");
        names.add("Jesse");
        names.add("Skyler");
        names.add("Mike");
        names.add("Saul");
        names.add("Walter"); // nothing happens

        System.out.println(names.size()); // 5
        System.out.println(names.contains("Saul")); // true
        System.out.println(names.isEmpty()); // false

        names.clear(); // delete all elements

        for (String name : names) {
            System.out.println(name);
        }
        // or
        names.forEach(System.out::println);
        // or
        Iterator<String> namesIterator = names.iterator();
        while (namesIterator.hasNext()) {
            System.out.println(namesIterator.next());
        }

        List<Integer> numberList = new ArrayList<>();
        numberList.add(3);
        numberList.add(3);
        numberList.add(5);
        numberList.add(1);
        numberList.add(2);
        numberList.add(1);
        numberList.add(9);
        System.out.println(numberList); // [3, 3, 5, 1, 2, 1, 9]

        Set<Integer> numberSet = new HashSet<>();
        numberSet.addAll(numberList);
        System.out.println(numberSet); // [3, 5, 1, 2, 9] duplicates removed

    }
}
