package linkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> myLinkedList = new LinkedList<>();

        myLinkedList.add("John");
        myLinkedList.add("Paul");
        myLinkedList.add("George");
        myLinkedList.add("Ringo");

        System.out.println(myLinkedList.get(2)); // George

        myLinkedList.add(1, "Jerry");

    }
}
