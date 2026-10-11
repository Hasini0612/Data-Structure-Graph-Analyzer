
package datastructures;

import util.ResultLog;

/**
 * Tests Singly Linked List operations and edge cases.
 * Component responsibility: K.J.F. Salma Jifry.
 */
public class LinkedListTest {

    public static void main(String[] args) {

        LinkedListOperations list = new LinkedListOperations();

        System.out.println("=== LINKED LIST TEST ===");

        System.out.println("\nTest 1: Empty Linked List");
        list.display();
        list.search(10);
        list.delete(10);
        System.out.println("Is Empty: " + list.isEmpty());

        System.out.println("\nTest 2: Insert Elements");
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.display();
        System.out.println("Size: " + list.size());

        System.out.println("\nTest 3: Search Existing Element");
        list.search(30);

        System.out.println("\nTest 4: Search Missing Element");
        list.search(99);

        System.out.println("\nTest 5: Delete First Element");
        list.delete(10);
        list.display();

        System.out.println("\nTest 6: Delete Middle Element");
        list.delete(30);
        list.display();

        System.out.println("\nTest 7: Delete Last Element");
        list.delete(40);
        list.display();

        System.out.println("\nTest 8: Delete Missing Element");
        list.delete(99);

        System.out.println("\nTest 9: Insert Again");
        list.insert(50);
        list.insert(60);
        list.display();
        System.out.println("Size: " + list.size());

        System.out.println("\nTest 10: Clear Linked List");
        list.clear();
        list.display();
        System.out.println("Is Empty: " + list.isEmpty());
        System.out.println("Size: " + list.size());

        System.out.println("\n=== SAVED RESULTS ===");
        ResultLog.showAll();
    }
}
