
package datastructures;

import util.ResultLog;

/**
 * Tests Stack and Queue operations, including empty cases.
 * Component responsibility: M.A. Mohamed Rimas.
 */
public class StackQueueTest {

    public static void main(String[] args) {

        System.out.println("=== STACK OPERATIONS TEST ===");

        StackOperations stack = new StackOperations();

        System.out.println("\nTest 1: Empty Stack");
        stack.display();
        stack.pop();
        stack.peek();

        System.out.println("\nTest 2: Push Elements");
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();

        System.out.println("\nTest 3: Peek");
        stack.peek();

        System.out.println("\nTest 4: Pop");
        stack.pop();
        stack.display();

        System.out.println("\nStack Size: " + stack.size());

        System.out.println("\n=== QUEUE OPERATIONS TEST ===");

        QueueOperations queue = new QueueOperations();

        System.out.println("\nTest 5: Empty Queue");
        queue.display();
        queue.dequeue();
        queue.front();

        System.out.println("\nTest 6: Enqueue Elements");
        queue.enqueue(100);
        queue.enqueue(200);
        queue.enqueue(300);
        queue.display();

        System.out.println("\nTest 7: Front");
        queue.front();

        System.out.println("\nTest 8: Dequeue");
        queue.dequeue();
        queue.display();

        System.out.println("\nQueue Size: " + queue.size());

        System.out.println("\n=== SAVED RESULTS ===");
        ResultLog.showAll();
    }
}
