
import java.util.Scanner;

import datastructures.ArrayOperations;
import datastructures.SearchingAlgorithms;
import datastructures.StackOperations;
import datastructures.QueueOperations;
import datastructures.LinkedListOperations;
import graph.GraphOperations;
import performance.PerformanceAnalyzer;
import util.InputHelper;
import util.ResultLog;

/**
 * Data Structure and Graph Analyzer
 * Main Menu and System Integration
 *
 * Integration responsibility: G.B. Hasini Kushalya
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayOperations array = new ArrayOperations(100);
        StackOperations stack = new StackOperations();
        QueueOperations queue = new QueueOperations();
        LinkedListOperations linkedList =
                new LinkedListOperations();
        GraphOperations graph = new GraphOperations();

        int choice;

        do {
            showMainMenu();

            choice = InputHelper.readIntInRange(
                    sc, "Enter your choice: ", 0, 8);

            switch (choice) {

                case 1:
                    arrayMenu(sc, array);
                    break;

                case 2:
                    searchingMenu(sc);
                    break;

                case 3:
                    stackMenu(sc, stack);
                    break;

                case 4:
                    queueMenu(sc, queue);
                    break;

                case 5:
                    linkedListMenu(sc, linkedList);
                    break;

                case 6:
                    graphMenu(sc, graph);
                    break;

                case 7:
                    performanceMenu(sc);
                    break;

                case 8:
                    ResultLog.showAll();
                    break;

                case 0:
                    System.out.println(
                            "Thank you for using the system!");
                    break;

                default:
                    System.out.println("Invalid option.");
            }

        } while (choice != 0);

        sc.close();
    }

    private static void showMainMenu() {

        System.out.println("\n====================================");
        System.out.println(" DATA STRUCTURE AND GRAPH ANALYZER");
        System.out.println("====================================");
        System.out.println("1. Array Operations");
        System.out.println("2. Searching Algorithms");
        System.out.println("3. Stack Operations");
        System.out.println("4. Queue Operations");
        System.out.println("5. Linked List Operations");
        System.out.println("6. Graph Operations");
        System.out.println("7. Performance Analysis");
        System.out.println("8. View Result Log");
        System.out.println("0. Exit");
        System.out.println("====================================");
    }

    private static void arrayMenu(
            Scanner sc, ArrayOperations array) {

        int choice;

        do {
            System.out.println("\n--- ARRAY OPERATIONS ---");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Search");
            System.out.println("4. Display");
            System.out.println("0. Back");

            choice = InputHelper.readIntInRange(
                    sc, "Choose: ", 0, 4);

            switch (choice) {

                case 1:
                    array.insert(InputHelper.readInt(
                            sc, "Enter value: "));
                    break;

                case 2:
                    array.delete(InputHelper.readInt(
                            sc, "Enter value: "));
                    break;

                case 3:
                    array.search(InputHelper.readInt(
                            sc, "Enter value: "));
                    break;

                case 4:
                    array.display();
                    break;
            }

        } while (choice != 0);
    }

    private static void searchingMenu(Scanner sc) {

        int size = InputHelper.readIntInRange(
                sc, "Number of elements (1-100): ", 1, 100);

        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = InputHelper.readInt(
                    sc, "Element " + (i + 1) + ": ");
        }

        int target = InputHelper.readInt(
                sc, "Enter target value: ");

        System.out.println("\n1. Linear Search");
        System.out.println("2. Binary Search");

        int choice = InputHelper.readIntInRange(
                sc, "Choose: ", 1, 2);

        if (choice == 1) {
            SearchingAlgorithms.linearSearch(
                    numbers, target);
        } else {
            SearchingAlgorithms.binarySearch(
                    numbers, target);
        }
    }

    private static void stackMenu(
            Scanner sc, StackOperations stack) {

        int choice;

        do {
            System.out.println("\n--- STACK OPERATIONS ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("0. Back");

            choice = InputHelper.readIntInRange(
                    sc, "Choose: ", 0, 4);

            switch (choice) {

                case 1:
                    stack.push(InputHelper.readInt(
                            sc, "Enter value: "));
                    break;

                case 2:
                    stack.pop();
                    break;

                case 3:
                    stack.peek();
                    break;

                case 4:
                    stack.display();
                    break;
            }

        } while (choice != 0);
    }

    private static void queueMenu(
            Scanner sc, QueueOperations queue) {

        int choice;

        do {
            System.out.println("\n--- QUEUE OPERATIONS ---");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Front");
            System.out.println("4. Display");
            System.out.println("0. Back");

            choice = InputHelper.readIntInRange(
                    sc, "Choose: ", 0, 4);

            switch (choice) {

                case 1:
                    queue.enqueue(InputHelper.readInt(
                            sc, "Enter value: "));
                    break;

                case 2:
                    queue.dequeue();
                    break;

                case 3:
                    queue.front();
                    break;

                case 4:
                    queue.display();
                    break;
            }

        } while (choice != 0);
    }

    private static void linkedListMenu(
            Scanner sc, LinkedListOperations list) {

        int choice;

        do {
            System.out.println("\n--- LINKED LIST OPERATIONS ---");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Search");
            System.out.println("4. Display");
            System.out.println("5. Clear");
            System.out.println("0. Back");

            choice = InputHelper.readIntInRange(
                    sc, "Choose: ", 0, 5);

            switch (choice) {

                case 1:
                    list.insert(InputHelper.readInt(
                            sc, "Enter value: "));
                    break;

                case 2:
                    list.delete(InputHelper.readInt(
                            sc, "Enter value: "));
                    break;

                case 3:
                    list.search(InputHelper.readInt(
                            sc, "Enter value: "));
                    break;

                case 4:
                    list.display();
                    break;

                case 5:
                    list.clear();
                    break;
            }

        } while (choice != 0);
    }

    private static void graphMenu(
            Scanner sc, GraphOperations graph) {

        int choice;

        do {
            System.out.println("\n--- GRAPH OPERATIONS ---");
            System.out.println("1. Add Vertex");
            System.out.println("2. Add Edge");
            System.out.println("3. Display Graph");
            System.out.println("4. BFS Traversal");
            System.out.println("5. DFS Traversal");
            System.out.println("6. Graph Statistics");
            System.out.println("7. Clear Graph");
            System.out.println("0. Back");

            choice = InputHelper.readIntInRange(
                    sc, "Choose: ", 0, 7);

            switch (choice) {

                case 1:
                    graph.addVertex(
                            InputHelper.readNonEmptyString(
                                    sc, "Vertex name: "));
                    break;

                case 2:
                    String source =
                            InputHelper.readNonEmptyString(
                                    sc, "Source vertex: ");

                    String destination =
                            InputHelper.readNonEmptyString(
                                    sc, "Destination vertex: ");

                    graph.addEdge(source, destination);
                    break;

                case 3:
                    graph.displayGraph();
                    break;

                case 4:
                    graph.bfs(
                            InputHelper.readNonEmptyString(
                                    sc, "Start vertex: "));
                    break;

                case 5:
                    graph.dfs(
                            InputHelper.readNonEmptyString(
                                    sc, "Start vertex: "));
                    break;

                case 6:
                    System.out.println(
                            "Vertices: " + graph.vertexCount());
                    System.out.println(
                            "Edges: " + graph.edgeCount());
                    break;

                case 7:
                    graph.clear();
                    break;
            }

        } while (choice != 0);
    }

    private static void performanceMenu(Scanner sc) {

        System.out.println(
                "\n--- SEARCH PERFORMANCE ANALYSIS ---");

        int size = InputHelper.readIntInRange(
                sc, "Dataset size (1-100000): ",
                1, 100000);

        PerformanceAnalyzer.compareSearches(size);
    }
}
