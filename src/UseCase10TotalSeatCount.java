import java.util.ArrayList;
import java.util.List;

/**
 * UseCase10TotalSeatCount - Aggregates total seating capacity across all bogies
 * using Stream map() and reduce() operations.
 */
public class UseCase10TotalSeatCount {

    /**
     * Main method - demonstrates Stream reduce to sum bogie capacities.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper",      "Passenger", 72));
        bogies.add(new Bogie("AC Chair",     "Passenger", 60));
        bogies.add(new Bogie("First Class",  "Passenger", 24));
        bogies.add(new Bogie("Second Class", "Passenger", 90));
        bogies.add(new Bogie("Executive",    "Passenger", 48));

        System.out.println("=== Bogie Seat Counts ===");
        bogies.forEach(b -> System.out.println("  " + b.name + ": " + b.capacity + " seats"));

        int totalCapacity = bogies.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);

        System.out.println("\n=== Total Train Capacity ===");
        System.out.println("Total seats across all bogies: " + totalCapacity);
    }
}
