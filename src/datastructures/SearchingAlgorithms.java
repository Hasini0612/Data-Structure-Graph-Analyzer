
package datastructures;

import java.util.Arrays;
import util.ResultLog;

/**
 * Implements Linear Search and Binary Search.
 * Component responsibility: M.N.M. Rashad.
 */
public class SearchingAlgorithms {

    /**
     * Linear Search checks elements one by one.
     * Time Complexity: O(n)
     */
    public static int linearSearch(int[] numbers, int target) {

        if (numbers == null) {
            throw new IllegalArgumentException("Array cannot be null.");
        }

        int steps = 0;
        long startTime = System.nanoTime();

        int index = -1;

        for (int i = 0; i < numbers.length; i++) {
            steps++;

            if (numbers[i] == target) {
                index = i;
                break;
            }
        }

        long executionTime = System.nanoTime() - startTime;

        String result = "Linear Search: " + target
                + (index >= 0
                    ? " found at index " + index
                    : " not found")
                + " | Steps: " + steps
                + " | Time: " + executionTime + " ns";

        System.out.println(result);
        ResultLog.add(result);

        return index;
    }

    /**
     * Binary Search works on a sorted array.
     * A sorted copy is created to avoid modifying
     * the original array.
     *
     * Returned index refers to the sorted array.
     * Time Complexity: O(n log n) including sorting.
     * Search itself: O(log n).
     */
    public static int binarySearch(int[] numbers, int target) {

        if (numbers == null) {
            throw new IllegalArgumentException("Array cannot be null.");
        }

        int[] sortedNumbers = Arrays.copyOf(
                numbers, numbers.length
        );

        Arrays.sort(sortedNumbers);

        System.out.println(
                "Sorted Array: " + Arrays.toString(sortedNumbers)
        );

        int left = 0;
        int right = sortedNumbers.length - 1;
        int steps = 0;
        int index = -1;

        long startTime = System.nanoTime();

        while (left <= right) {

            int middle = left + (right - left) / 2;
            steps++;

            if (sortedNumbers[middle] == target) {
                index = middle;
                break;
            }

            if (sortedNumbers[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        long executionTime = System.nanoTime() - startTime;

        String result = "Binary Search: " + target
                + (index >= 0
                    ? " found at sorted index " + index
                    : " not found")
                + " | Steps: " + steps
                + " | Search Time: " + executionTime + " ns";

        System.out.println(result);
        ResultLog.add(result);

        return index;
    }
}
