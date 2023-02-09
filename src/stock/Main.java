package stock;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("Portal");
        stack.push("Portal 2");
        stack.push("The Witness");
        stack.push("They Are Billions");
        stack.push("Chrono Trigger");

        System.out.println(stack.peek());

        String favorite = stack.pop();
        System.out.println(stack);
        System.out.println(favorite);

        System.out.println(stack.search("Portal"));
    }
}
