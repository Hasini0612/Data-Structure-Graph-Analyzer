
package datastructures;

import util.ResultLog;
import java.util.Arrays;

/**
 * Tests Linear Search and Binary Search.
 */
public class SearchingTest {

    public static void main(String[] args) {

        int[] numbers = {40, 10, 30, 20, 50};

        System.out.println("=== SEARCHING ALGORITHMS TEST ===");
        System.out.println("Original Array: "
                + Arrays.toString(numbers));

        // Test 1: Linear Search - Found
        System.out.println("\nTest 1: Linear Search (Found)");
        SearchingAlgorithms.linearSearch(numbers, 30);

        // Test 2: Linear Search - Not Found
        System.out.println("\nTest 2: Linear Search (Not Found)");
        SearchingAlgorithms.linearSearch(numbers, 99);

        // Test 3: Binary Search - Found
        System.out.println("\nTest 3: Binary Search (Found)");
        SearchingAlgorithms.binarySearch(numbers, 30);

        // Test 4: Binary Search - Not Found
        System.out.println("\nTest 4: Binary Search (Not Found)");
        SearchingAlgorithms.binarySearch(numbers, 99);

        // Test 5: Empty Array
        System.out.println("\nTest 5: Empty Array");
        int[] emptyArray = {};
        SearchingAlgorithms.linearSearch(emptyArray, 10);
        SearchingAlgorithms.binarySearch(emptyArray, 10);

        // Display stored search results
        System.out.println("\n=== SAVED RESULTS ===");
        ResultLog.showAll();
    }
}
