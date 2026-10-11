
package datastructures;

import java.util.ArrayDeque;
import java.util.Queue;
import util.ResultLog;

/**
 * Queue operations using FIFO (First In, First Out).
 * Component responsibility: M.A. Mohamed Rimas.
 */
public class QueueOperations {

    private final Queue<Integer> queue = new ArrayDeque<>();

    /**
     * Adds a value to the rear of the queue.
     * Time Complexity: O(1)
     */
    public void enqueue(int value) {

        queue.offer(value);

        String result = "Queue Enqueue: " + value + " added.";
        System.out.println(result);
        ResultLog.add(result);
    }

    /**
     * Removes and returns the front value.
     * Time Complexity: O(1)
     */
    public Integer dequeue() {

        if (queue.isEmpty()) {
            System.out.println("Queue Underflow: Queue is empty.");
            ResultLog.add("Queue Dequeue: Failed - empty queue.");
            return null;
        }

        int value = queue.poll();

        String result = "Queue Dequeue: " + value + " removed.";
        System.out.println(result);
        ResultLog.add(result);

        return value;
    }

    /**
     * Returns the front value without removing it.
     * Time Complexity: O(1)
     */
    public Integer front() {

        if (queue.isEmpty()) {
            System.out.println("Queue is empty. No front element.");
            ResultLog.add("Queue Front: Failed - empty queue.");
            return null;
        }

        int value = queue.peek();

        String result = "Queue Front: " + value;
        System.out.println(result);
        ResultLog.add(result);

        return value;
    }

    /**
     * Displays all queue elements from front to rear.
     * Time Complexity: O(n)
     */
    public void display() {

        if (queue.isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.print("Queue (Front to Rear): [");

        int index = 0;

        for (int value : queue) {
            if (index > 0) {
                System.out.print(", ");
            }

            System.out.print(value);
            index++;
        }

        System.out.println("]");
    }

    /**
     * Checks whether the queue is empty.
     */
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    /**
     * Returns the number of elements.
     */
    public int size() {
        return queue.size();
    }
}
