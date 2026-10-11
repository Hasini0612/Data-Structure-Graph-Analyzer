package datastructures;

public class ArrayTest {

    public static void main(String[] args) {

        ArrayOperations array = new ArrayOperations(3);

        System.out.println("=== ARRAY EDGE CASE TEST ===");

        // Test empty array
        array.display();

        // Test deleting a missing number
        array.delete(50);

        // Fill the array
        array.insert(10);
        array.insert(20);
        array.insert(30);

        // Test inserting into a full array
        array.insert(40);

        array.display();

        // Delete and insert again
        array.delete(20);
        array.insert(40);

        array.display();
    }
}