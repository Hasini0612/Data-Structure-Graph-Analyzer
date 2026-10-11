package datastructures;

/**
 * Array operations component.
 * Implemented by M.N.M. Rashad.
 */
public class ArrayOperations {

    private final int[] numbers;
    private int size;

    public ArrayOperations(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException(
                "Array capacity must be greater than zero."
            );
        }

        numbers = new int[capacity];
        size = 0;
    }
/**
 * Inserts a new number at the end of the array.
 * Time Complexity: O(1)
 */
public void insert(int value) {

    if (size == numbers.length) {
        System.out.println("Array is full. Cannot insert.");
        return;
    }

    numbers[size] = value;
    size++;

    System.out.println(value + " inserted successfully.");
}/**
 * Deletes the first occurrence of a value.
 * Time Complexity: O(n)
 */
public void delete(int value) {

    int index = -1;

    // Find the value
    for (int i = 0; i < size; i++) {
        if (numbers[i] == value) {
            index = i;
            break;
        }
    }

    // Value not found
    if (index == -1) {
        System.out.println(value + " not found in the array.");
        return;
    }

    // Shift elements to the left
    for (int i = index; i < size - 1; i++) {
        numbers[i] = numbers[i + 1];
    }

    size--;

    System.out.println(value + " deleted successfully.");
}/**
 * Searches for the first occurrence of a value.
 * Returns its index or -1 if not found.
 * Time Complexity: O(n)
 */
public int search(int value) {

    for (int i = 0; i < size; i++) {

        if (numbers[i] == value) {
            System.out.println(
                value + " found at index " + i
            );
            return i;
        }
    }

    System.out.println(value + " not found in the array.");
    return -1;
}/**
 * Displays all elements in the array.
 * Time Complexity: O(n)
 */
public void display() {

    if (size == 0) {
        System.out.println("Array is empty.");
        return;
    }

    System.out.print("Array Elements: [");

    for (int i = 0; i < size; i++) {
        System.out.print(numbers[i]);

        if (i < size - 1) {
            System.out.print(", ");
        }
    }

    System.out.println("]");
}}