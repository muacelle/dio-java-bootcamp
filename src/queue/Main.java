package queue;

import java.util.LinkedList;
import java.util.Queue;

// Queue = FIFO data structure (First-In, First-Out).
// It's a line.

public class Main {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.offer("Karen");
        queue.offer("Steve");
        queue.offer("Chad");
        queue.offer("Harold");

        System.out.println(queue.isEmpty());          // false
        System.out.println(queue.size());             // 4
        System.out.println(queue.contains("Harold")); // true
        System.out.println(queue.peek());             // Karen

        queue.poll();

        System.out.println(queue);                    // [Steve, Chad, Harold]

    }
}
