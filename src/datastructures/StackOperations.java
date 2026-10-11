
package datastructures;

import java.util.ArrayDeque;
import java.util.Deque;
import util.ResultLog;

/**
 * Stack operations using LIFO (Last In, First Out).
 * Component responsibility: M.A. Mohamed Rimas.
 */
public class StackOperations {

    private final Deque<Integer> stack = new ArrayDeque<>();

    /**
     * Adds a value to the top of the stack.
     * Time Complexity: O(1)
     */
    public void push(int value) {
        stack.push(value);

        String result = "Stack Push: " + value + " added.";
        System.out.println(result);
        ResultLog.add(result);
    }

    /**
     * Removes and returns the top value.
     * Time Complexity: O(1)
     */
    public Integer pop() {
        if (stack.isEmpty()) {
            System.out.println("Stack Underflow: Stack is empty.");
            ResultLog.add("Stack Pop: Failed - empty stack.");
            return null;
        }

        int value = stack.pop();

        String result = "Stack Pop: " + value + " removed.";
        System.out.println(result);
        ResultLog.add(result);

        return value;
    }

    /**
     * Returns the top value without removing it.
     * Time Complexity: O(1)
     */
    public Integer peek() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty. Nothing to peek.");
            ResultLog.add("Stack Peek: Failed - empty stack.");
            return null;
        }

        int value = stack.peek();

        String result = "Stack Peek: Top value is " + value;
        System.out.println(result);
        ResultLog.add(result);

        return value;
    }

    /**
     * Displays elements from top to bottom.
     * Time Complexity: O(n)
     */
    public void display() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }

        System.out.println("Stack (Top to Bottom):");

        for (int value : stack) {
            System.out.println("| " + value + " |");
        }
    }

    /**
     * Checks whether the stack is empty.
     */
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    /**
     * Returns the number of elements.
     */
    public int size() {
        return stack.size();
    }
}
