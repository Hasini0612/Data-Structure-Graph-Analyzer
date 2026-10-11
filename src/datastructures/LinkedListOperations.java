
package datastructures;

import util.ResultLog;

/**
 * Singly Linked List implementation.
 * Component responsibility: K.J.F. Salma Jifry.
 */
public class LinkedListOperations {

    // Represents one node in the linked list.
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private int size;

    public LinkedListOperations() {
        head = null;
        size = 0;
    }

    /**
     * Inserts a new value at the end.
     * Time Complexity: O(n)
     */
    public void insert(int value) {

        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;

            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
        }

        size++;

        String result = "Linked List Insert: " + value + " added.";
        System.out.println(result);
        ResultLog.add(result);
    }

    /**
     * Deletes the first occurrence of a value.
     * Time Complexity: O(n)
     */
    public boolean delete(int value) {

        if (head == null) {
            String result = "Linked List Delete: Failed - list is empty.";
            System.out.println(result);
            ResultLog.add(result);
            return false;
        }

        if (head.data == value) {
            head = head.next;
            size--;

            String result = "Linked List Delete: " + value + " removed.";
            System.out.println(result);
            ResultLog.add(result);
            return true;
        }

        Node current = head;

        while (current.next != null &&
               current.next.data != value) {
            current = current.next;
        }

        if (current.next == null) {
            String result = "Linked List Delete: " + value + " not found.";
            System.out.println(result);
            ResultLog.add(result);
            return false;
        }

        current.next = current.next.next;
        size--;

        String result = "Linked List Delete: " + value + " removed.";
        System.out.println(result);
        ResultLog.add(result);

        return true;
    }

    /**
     * Searches for a value in the linked list.
     * Time Complexity: O(n)
     */
    public boolean search(int value) {

        Node current = head;
        int position = 0;

        while (current != null) {

            if (current.data == value) {
                String result = "Linked List Search: " + value
                        + " found at position " + position + ".";
                System.out.println(result);
                ResultLog.add(result);
                return true;
            }

            current = current.next;
            position++;
        }

        String result = "Linked List Search: " + value + " not found.";
        System.out.println(result);
        ResultLog.add(result);

        return false;
    }

    /**
     * Displays all elements.
     * Time Complexity: O(n)
     */
    public void display() {

        if (head == null) {
            System.out.println("Linked List is empty.");
            return;
        }

        Node current = head;

        System.out.print("Linked List: ");

        while (current != null) {
            System.out.print(current.data);

            if (current.next != null) {
                System.out.print(" -> ");
            }

            current = current.next;
        }

        System.out.println(" -> NULL");
    }

    /**
     * Returns true if the list is empty.
     */
    public boolean isEmpty() {
        return head == null;
    }

    /**
     * Returns the total number of nodes.
     */
    public int size() {
        return size;
    }

    /**
     * Removes all nodes.
     * Time Complexity: O(1)
     */
    public void clear() {
        head = null;
        size = 0;

        String result = "Linked List Clear: All nodes removed.";
        System.out.println(result);
        ResultLog.add(result);
    }
}
