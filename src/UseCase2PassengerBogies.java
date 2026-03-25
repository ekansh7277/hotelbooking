import java.util.ArrayList;
import java.util.List;

/**
 * UseCase2PassengerBogies - Demonstrates ArrayList CRUD operations on passenger bogies.
 * Covers add, remove, and contains operations.
 */
public class UseCase2PassengerBogies {

    /**
     * Main method - demonstrates ArrayList operations on passenger bogies.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        List<String> passengerBogies = new ArrayList<>();

        // Add bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("=== Passenger Bogies (Initial) ===");
        passengerBogies.forEach(System.out::println);

        // Remove AC Chair
        passengerBogies.remove("AC Chair");
        System.out.println("\nAfter removing AC Chair:");

        // Check existence
        System.out.println("Contains 'AC Chair': " + passengerBogies.contains("AC Chair"));
        System.out.println("Contains 'Sleeper' : " + passengerBogies.contains("Sleeper"));

        System.out.println("\n=== Passenger Bogies (Final) ===");
        passengerBogies.forEach(System.out::println);
        System.out.println("Total bogies: " + passengerBogies.size());
    }
}
