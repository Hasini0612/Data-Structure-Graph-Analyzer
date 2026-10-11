
package performance;

import java.util.Arrays;
import java.util.Random;
import util.ResultLog;

/**
 * Compares Linear Search and Binary Search performance.
 * Component responsibility: K.J.F. Salma Jifry.
 *
 * Binary Search requires sorted data.
 * This class measures search time only, excluding sorting.
 */
public class PerformanceAnalyzer {

    private static class SearchResult {
        int index;
        int comparisons;
        long timeNs;

        SearchResult(int index, int comparisons, long timeNs) {
            this.index = index;
            this.comparisons = comparisons;
            this.timeNs = timeNs;
        }
    }

    /**
     * Performs Linear Search.
     * Time Complexity: O(n)
     */
    private static SearchResult linearSearch(int[] array, int target) {

        int comparisons = 0;
        int index = -1;

        long start = System.nanoTime();

        for (int i = 0; i < array.length; i++) {
            comparisons++;

            if (array[i] == target) {
                index = i;
                break;
            }
        }

        long end = System.nanoTime();

        return new SearchResult(index, comparisons, end - start);
    }

    /**
     * Performs Binary Search on sorted data.
     * Time Complexity: O(log n)
     */
    private static SearchResult binarySearch(int[] array, int target) {

        int left = 0;
        int right = array.length - 1;
        int comparisons = 0;
        int index = -1;

        long start = System.nanoTime();

        while (left <= right) {

            int mid = left + (right - left) / 2;
            comparisons++;

            if (array[mid] == target) {
                index = mid;
                break;
            }

            if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        long end = System.nanoTime();

        return new SearchResult(index, comparisons, end - start);
    }

    /**
     * Compares both search algorithms using the same dataset.
     */
    public static void compareSearches(int size) {

        if (size <= 0) {
            System.out.println("Dataset size must be greater than zero.");
            return;
        }

        int[] data = new int[size];
        Random random = new Random(42);

        for (int i = 0; i < size; i++) {
            data[i] = random.nextInt(1000000);
        }

        Arrays.sort(data);

        // Choose a value guaranteed to exist.
        int target = data[data.length - 1];

        SearchResult linear = linearSearch(data, target);
        SearchResult binary = binarySearch(data, target);

        System.out.println("\n=== PERFORMANCE COMPARISON ===");
        System.out.println("Dataset Size: " + size);
        System.out.println("Target Value: " + target);

        System.out.println("\nLinear Search:");
        System.out.println("Index: " + linear.index);
        System.out.println("Comparisons: " + linear.comparisons);
        System.out.println("Execution Time: " + linear.timeNs + " ns");

        System.out.println("\nBinary Search:");
        System.out.println("Index: " + binary.index);
        System.out.println("Comparisons: " + binary.comparisons);
        System.out.println("Execution Time: " + binary.timeNs + " ns");

        String result = "Performance Analysis: Size=" + size
                + ", Linear Comparisons=" + linear.comparisons
                + ", Binary Comparisons=" + binary.comparisons
                + ", Linear Time=" + linear.timeNs + " ns"
                + ", Binary Time=" + binary.timeNs + " ns";

        ResultLog.add(result);
    }
}
