package util;

import java.util.ArrayList;
import java.util.List;

/**
 * Stores results from every component so the main menu can
 * show them all together (menu option 8: Display All Results).
 */
public class ResultLog {

    private static final List<String> entries = new ArrayList<>();

    /** Adds one result line, for example "Linear Search: found 42 at index 3 (4 steps)". */
    public static void add(String entry) {
        entries.add(entry);
    }

    public static boolean isEmpty() {
        return entries.isEmpty();
    }

    /** Prints every stored result. */
    public static void showAll() {
        System.out.println("=============================================");
        System.out.println(" ALL RESULTS");
        System.out.println("=============================================");
        if (entries.isEmpty()) {
            System.out.println("No results recorded yet.");
        } else {
            for (int i = 0; i < entries.size(); i++) {
                System.out.println((i + 1) + ". " + entries.get(i));
            }
        }
        System.out.println("=============================================");
    }
}