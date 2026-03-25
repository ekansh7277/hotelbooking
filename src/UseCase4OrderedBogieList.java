import java.util.LinkedList;

/**
 * UseCase4OrderedBogieList - Maintains an ordered bogie formation using LinkedList.
 * Demonstrates positional insertion, head/tail removal, and index-based access.
 */
public class UseCase4OrderedBogieList {

    /**
     * Main method - demonstrates LinkedList operations on ordered bogie formation.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        LinkedList<String> bogieList = new LinkedList<>();

        // Build initial formation
        bogieList.addLast("Engine");
        bogieList.addLast("Sleeper");
        bogieList.addLast("AC");
        bogieList.addLast("Cargo");
        bogieList.addLast("Guard");

        System.out.println("=== Initial Bogie Formation ===");
        System.out.println(bogieList);

        // Insert Pantry at position 2
        bogieList.add(2, "Pantry");
        System.out.println("\nAfter inserting Pantry at position 2:");
        System.out.println(bogieList);

        // Remove first and last bogies
        String removedFirst = bogieList.removeFirst();
        String removedLast  = bogieList.removeLast();
        System.out.println("\nRemoved first: " + removedFirst);
        System.out.println("Removed last : " + removedLast);

        System.out.println("\n=== Final Ordered Bogie Formation ===");
        bogieList.forEach(bogie -> System.out.println("  " + bogie));
        System.out.println("Total bogies: " + bogieList.size());
    }
}
