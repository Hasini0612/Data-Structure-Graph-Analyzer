
package graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

import util.ResultLog;

/**
 * Undirected Graph using an adjacency list.
 * Supports vertices, edges, BFS and DFS.
 *
 * Component responsibility: G.B. Hasini Kushalya.
 */
public class GraphOperations {

    private final Map<String, Set<String>> adjacencyList;

    public GraphOperations() {
        adjacencyList = new LinkedHashMap<>();
    }

    /**
     * Adds a new vertex.
     * Returns false if the vertex already exists.
     */
    public boolean addVertex(String vertex) {

        if (vertex == null || vertex.trim().isEmpty()) {
            System.out.println("Invalid vertex name.");
            return false;
        }

        vertex = vertex.trim();

        if (adjacencyList.containsKey(vertex)) {
            System.out.println("Vertex already exists: " + vertex);
            return false;
        }

        adjacencyList.put(vertex, new LinkedHashSet<>());

        String result = "Graph Vertex Added: " + vertex;
        System.out.println(result);
        ResultLog.add(result);

        return true;
    }

    /**
     * Adds an undirected edge between two existing vertices.
     */
    public boolean addEdge(String source, String destination) {

        if (source == null || destination == null) {
            System.out.println("Invalid connection.");
            return false;
        }

        source = source.trim();
        destination = destination.trim();

        if (!adjacencyList.containsKey(source)
                || !adjacencyList.containsKey(destination)) {

            System.out.println("Connection failed: Vertex not found.");
            return false;
        }

        if (source.equals(destination)) {
            System.out.println("Self-connections are not allowed.");
            return false;
        }

        if (adjacencyList.get(source).contains(destination)) {
            System.out.println("Connection already exists.");
            return false;
        }

        adjacencyList.get(source).add(destination);
        adjacencyList.get(destination).add(source);

        String result = "Graph Edge Added: "
                + source + " <-> " + destination;

        System.out.println(result);
        ResultLog.add(result);

        return true;
    }

    /**
     * Displays all vertices and their connections.
     */
    public void displayGraph() {

        if (adjacencyList.isEmpty()) {
            System.out.println("Graph is empty.");
            return;
        }

        System.out.println("\n=== GRAPH ADJACENCY LIST ===");

        for (Map.Entry<String, Set<String>> entry
                : adjacencyList.entrySet()) {

            System.out.print(entry.getKey() + " -> ");

            if (entry.getValue().isEmpty()) {
                System.out.println("No connections");
            } else {
                System.out.println(
                        String.join(", ", entry.getValue())
                );
            }
        }
    }

    /**
     * Breadth-First Search using a Queue.
     * Time Complexity: O(V + E)
     */
    public List<String> bfs(String start) {

        List<String> traversal = new ArrayList<>();

        if (start == null
                || !adjacencyList.containsKey(start.trim())) {

            System.out.println("BFS failed: Start vertex not found.");
            return traversal;
        }

        start = start.trim();

        Set<String> visited = new LinkedHashSet<>();
        Queue<String> queue = new ArrayDeque<>();

        visited.add(start);
        queue.add(start);

        while (!queue.isEmpty()) {

            String current = queue.remove();
            traversal.add(current);

            for (String neighbor : adjacencyList.get(current)) {

                if (visited.add(neighbor)) {
                    queue.add(neighbor);
                }
            }
        }

        String result = "Graph BFS: "
                + String.join(" -> ", traversal);

        System.out.println(result);
        ResultLog.add(result);

        return traversal;
    }

    /**
     * Depth-First Search using a Stack.
     * Time Complexity: O(V + E)
     */
    public List<String> dfs(String start) {

        List<String> traversal = new ArrayList<>();

        if (start == null
                || !adjacencyList.containsKey(start.trim())) {

            System.out.println("DFS failed: Start vertex not found.");
            return traversal;
        }

        start = start.trim();

        Set<String> visited = new LinkedHashSet<>();
        Deque<String> stack = new ArrayDeque<>();

        stack.push(start);

        while (!stack.isEmpty()) {

            String current = stack.pop();

            if (!visited.add(current)) {
                continue;
            }

            traversal.add(current);

            List<String> neighbors = new ArrayList<>(
                    adjacencyList.get(current)
            );

            // Reverse order for predictable DFS traversal.
            for (int i = neighbors.size() - 1; i >= 0; i--) {

                String neighbor = neighbors.get(i);

                if (!visited.contains(neighbor)) {
                    stack.push(neighbor);
                }
            }
        }

        String result = "Graph DFS: "
                + String.join(" -> ", traversal);

        System.out.println(result);
        ResultLog.add(result);

        return traversal;
    }

    /**
     * Returns the total number of vertices.
     */
    public int vertexCount() {
        return adjacencyList.size();
    }

    /**
     * Returns the total number of undirected edges.
     */
    public int edgeCount() {

        int total = 0;

        for (Set<String> neighbors : adjacencyList.values()) {
            total += neighbors.size();
        }

        return total / 2;
    }

    /**
     * Checks whether a vertex exists.
     */
    public boolean containsVertex(String vertex) {

        return vertex != null
                && adjacencyList.containsKey(vertex.trim());
    }

    /**
     * Clears the entire graph.
     */
    public void clear() {

        adjacencyList.clear();

        String result = "Graph Clear: All vertices and edges removed.";
        System.out.println(result);
        ResultLog.add(result);
    }
}
