package stack;

import java.util.Stack;

// Stack = LIFO data structure (Last-In, First-Out).
// Stores objects into a "vertical tower".

public class Main {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("Portal");
        stack.push("Portal 2");
        stack.push("The Witness");
        stack.push("They Are Billions");
        stack.push("Chrono Trigger");

        System.out.println(stack.peek());               // Chrono Trigger
        String favorite = stack.pop();
        System.out.println(stack);                      // [Portal, Portal 2, The Witness, They Are Billions]
        System.out.println(favorite);                   // Chrono Trigger
        System.out.println(stack.search("Portal"));  // 4
    }
}
