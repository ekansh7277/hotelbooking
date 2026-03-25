import java.util.HashMap;
import java.util.Map;

/**
 * UseCase6BogieCapacityMap - Maps each bogie type to its seating capacity.
 * Uses HashMap for O(1) lookup and entrySet for full iteration.
 */
public class UseCase6BogieCapacityMap {

    /**
     * Main method - demonstrates HashMap bogie-to-capacity mapping.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Map<String, Integer> bogieCapacity = new HashMap<>();

        // Map bogie types to their seating capacities
        bogieCapacity.put("Sleeper",     72);
        bogieCapacity.put("AC Chair",    60);
        bogieCapacity.put("First Class", 24);

        System.out.println("=== Bogie Capacity Map ===");
        System.out.printf("%-15s %s%n", "Bogie Type", "Capacity");
        System.out.println("----------------------------");

        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.printf("%-15s %d seats%n", entry.getKey(), entry.getValue());
        }

        int totalCapacity = bogieCapacity.values().stream().mapToInt(Integer::intValue).sum();
        System.out.println("----------------------------");
        System.out.println("Total capacity: " + totalCapacity + " seats");
    }
}
