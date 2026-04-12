import java.util.ArrayList;
import java.util.List;

/**
 * UseCase20ExceptionHandlingSearch - Prevents search operations on empty collections.
 * Implements fail-fast behavior by throwing IllegalStateException immediately.
 */
public class UseCase20ExceptionHandlingSearch {

    /**
     * Searches for a bogie ID in the provided list.
     * Throws IllegalStateException if the list is empty (fail-fast).
     *
     * @param bogieIds list of bogie IDs to search
     * @param target   the bogie ID to find
     * @return the found bogie ID
     * @throws IllegalStateException if the collection is empty
     * @throws RuntimeException      if the bogie ID is not found
     */
    public static String searchBogieId(List<String> bogieIds, String target) {
        if (bogieIds == null || bogieIds.isEmpty()) {
            throw new IllegalStateException("No bogies available. Search cannot be performed.");
        }

        for (String id : bogieIds) {
            if (id.equals(target)) {
                return id;
            }
        }
        throw new RuntimeException("Bogie ID \"" + target + "\" not found in the consist.");
    }

    /**
     * Main method - demonstrates exception handling during search on empty and populated lists.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        System.out.println("=== Exception Handling During Search Operations ===\n");

        // Scenario 1: Empty collection – fail-fast
        System.out.println("--- Scenario 1: Search on empty collection ---");
        try {
            searchBogieId(new ArrayList<>(), "BG-101");
        } catch (IllegalStateException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        // Scenario 2: Populated collection – target not found
        System.out.println("\n--- Scenario 2: Search on populated collection (not found) ---");
        List<String> bogieIds = List.of("BG-101", "BG-203", "BG-305", "BG-412");
        try {
            searchBogieId(bogieIds, "BG-999");
        } catch (RuntimeException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        // Scenario 3: Populated collection – target found
        System.out.println("\n--- Scenario 3: Search on populated collection (found) ---");
        try {
            String result = searchBogieId(bogieIds, "BG-305");
            System.out.println("FOUND: " + result);
        } catch (RuntimeException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        System.out.println("\nSearch operations completed. System stable.");
    }
}
