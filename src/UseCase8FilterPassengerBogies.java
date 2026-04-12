import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * UseCase8FilterPassengerBogies - Filters passenger bogies with capacity greater than 60
 * using Java Stream API pipeline.
 */
public class UseCase8FilterPassengerBogies {

    /**
     * Main method - demonstrates Stream filter and collect on bogie capacity.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper",      "Passenger", 72));
        bogies.add(new Bogie("AC Chair",     "Passenger", 60));
        bogies.add(new Bogie("First Class",  "Passenger", 24));
        bogies.add(new Bogie("Second Class", "Passenger", 90));
        bogies.add(new Bogie("Executive",    "Passenger", 48));

        System.out.println("=== All Bogies ===");
        bogies.forEach(System.out::println);

        List<Bogie> highCapacity = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        System.out.println("\n=== Bogies with Capacity > 60 ===");
        if (highCapacity.isEmpty()) {
            System.out.println("No bogies match the filter.");
        } else {
            highCapacity.forEach(System.out::println);
        }
        System.out.println("Filtered count: " + highCapacity.size());
    }
}
