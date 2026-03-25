import java.util.HashSet;
import java.util.Set;

/**
 * UseCase3UniqueBogieIDs - Tracks unique bogie IDs using HashSet.
 * Duplicate entries are automatically rejected by the Set contract.
 */
public class UseCase3UniqueBogieIDs {

    /**
     * Main method - demonstrates HashSet duplicate elimination for bogie IDs.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Set<String> bogieIds = new HashSet<>();

        // Add bogie IDs including intentional duplicates
        bogieIds.add("BG-101");
        bogieIds.add("BG-102");
        bogieIds.add("BG-103");
        bogieIds.add("BG-101"); // duplicate
        bogieIds.add("BG-104");
        bogieIds.add("BG-102"); // duplicate
        bogieIds.add("BG-105");

        System.out.println("=== Unique Bogie IDs (HashSet) ===");
        System.out.println("Total unique IDs: " + bogieIds.size());
        System.out.println("\nBogie IDs:");
        bogieIds.forEach(id -> System.out.println("  " + id));
    }
}
