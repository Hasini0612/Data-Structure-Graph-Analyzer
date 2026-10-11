
package graph;

import java.util.Arrays;
import java.util.List;
import util.ResultLog;

/**
 * Tests Graph operations, BFS and DFS traversals.
 * Component responsibility: G.B. Hasini Kushalya.
 */
public class GraphTest {

    private static int passed = 0;
    private static int failed = 0;

    private static void check(String testName,
                              boolean condition) {

        if (condition) {
            passed++;
            System.out.println("[PASS] " + testName);
        } else {
            failed++;
            System.out.println("[FAIL] " + testName);
        }
    }

    public static void main(String[] args) {

        GraphOperations graph = new GraphOperations();

        System.out.println("================================");
        System.out.println("       GRAPH OPERATIONS TEST");
        System.out.println("================================");

        System.out.println("\nTest 1: Empty Graph");
        graph.displayGraph();
        check("Empty graph has zero vertices",
                graph.vertexCount() == 0);
        check("Empty graph has zero edges",
                graph.edgeCount() == 0);

        System.out.println("\nTest 2: Add Vertices");
        check("Add A", graph.addVertex("A"));
        check("Add B", graph.addVertex("B"));
        check("Add C", graph.addVertex("C"));
        check("Add D", graph.addVertex("D"));
        check("Add E", graph.addVertex("E"));
        check("Vertex count is 5",
                graph.vertexCount() == 5);

        System.out.println("\nTest 3: Duplicate Vertex");
        check("Reject duplicate A",
                !graph.addVertex("A"));

        System.out.println("\nTest 4: Invalid Vertex");
        check("Reject empty vertex",
                !graph.addVertex("  "));
        check("Reject null vertex",
                !graph.addVertex(null));

        System.out.println("\nTest 5: Add Edges");
        check("Connect A-B",
                graph.addEdge("A", "B"));
        check("Connect A-C",
                graph.addEdge("A", "C"));
        check("Connect B-D",
                graph.addEdge("B", "D"));
        check("Connect C-E",
                graph.addEdge("C", "E"));
        check("Edge count is 4",
                graph.edgeCount() == 4);

        System.out.println("\nTest 6: Invalid Edges");
        check("Reject duplicate A-B",
                !graph.addEdge("A", "B"));
        check("Reject self connection",
                !graph.addEdge("A", "A"));
        check("Reject missing vertex",
                !graph.addEdge("A", "Z"));

        System.out.println("\nTest 7: Display Graph");
        graph.displayGraph();

        System.out.println("\nTest 8: BFS Traversal");
        List<String> bfs = graph.bfs("A");
        check("BFS order is correct",
                bfs.equals(Arrays.asList(
                        "A", "B", "C", "D", "E"
                )));

        System.out.println("\nTest 9: DFS Traversal");
        List<String> dfs = graph.dfs("A");
        check("DFS order is correct",
                dfs.equals(Arrays.asList(
                        "A", "B", "D", "C", "E"
                )));

        System.out.println("\nTest 10: Invalid Start Vertex");
        check("BFS rejects missing vertex",
                graph.bfs("Z").isEmpty());
        check("DFS rejects missing vertex",
                graph.dfs("Z").isEmpty());

        System.out.println("\nTest 11: Check Vertex Existence");
        check("A exists",
                graph.containsVertex("A"));
        check("Z does not exist",
                !graph.containsVertex("Z"));

        System.out.println("\nTest 12: Clear Graph");
        graph.clear();
        graph.displayGraph();
        check("Vertex count after clear",
                graph.vertexCount() == 0);
        check("Edge count after clear",
                graph.edgeCount() == 0);

        System.out.println("\n================================");
        System.out.println("          TEST SUMMARY");
        System.out.println("================================");
        System.out.println("Passed: " + passed);
        System.out.println("Failed: " + failed);

        if (failed == 0) {
            System.out.println("ALL GRAPH TESTS PASSED!");
        } else {
            System.out.println("SOME GRAPH TESTS FAILED!");
        }

        System.out.println("\n=== SAVED RESULTS ===");
        ResultLog.showAll();
    }
}
