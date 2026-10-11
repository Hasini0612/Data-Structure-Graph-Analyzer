
package performance;

import util.ResultLog;

/**
 * Tests Linear Search and Binary Search performance.
 * Component responsibility: K.J.F. Salma Jifry.
 */
public class PerformanceTest {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println(" SEARCH PERFORMANCE TESTING");
        System.out.println("=================================");

        System.out.println("\nTest 1: Small Dataset (10 elements)");
        PerformanceAnalyzer.compareSearches(10);

        System.out.println("\nTest 2: Medium Dataset (100 elements)");
        PerformanceAnalyzer.compareSearches(100);

        System.out.println("\nTest 3: Large Dataset (1000 elements)");
        PerformanceAnalyzer.compareSearches(1000);

        System.out.println("\nTest 4: Very Large Dataset (10000 elements)");
        PerformanceAnalyzer.compareSearches(10000);

        System.out.println("\nTest 5: Invalid Dataset Size");
        PerformanceAnalyzer.compareSearches(0);

        System.out.println("\n=================================");
        System.out.println(" SAVED PERFORMANCE RESULTS");
        System.out.println("=================================");

        ResultLog.showAll();
    }
}
