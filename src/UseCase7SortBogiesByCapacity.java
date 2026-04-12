import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * UseCase7SortBogiesByCapacity - Sorts passenger bogies by seating capacity
 * in ascending order using a custom Comparator.
 */
public class UseCase7SortBogiesByCapacity {

    /**
     * Main method - demonstrates Comparator-based sorting on bogie capacity.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper",     "Passenger", 72));
        bogies.add(new Bogie("AC Chair",    "Passenger", 60));
        bogies.add(new Bogie("First Class", "Passenger", 24));
        bogies.add(new Bogie("Second Class","Passenger", 90));
        bogies.add(new Bogie("Executive",   "Passenger", 48));

        System.out.println("=== Bogies Before Sorting ===");
        bogies.forEach(System.out::println);

        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        System.out.println("\n=== Bogies Sorted by Capacity (Ascending) ===");
        bogies.forEach(System.out::println);
    }
}
