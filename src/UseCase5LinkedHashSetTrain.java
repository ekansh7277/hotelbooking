import java.util.LinkedHashSet;
import java.util.Set;

/**
 * UseCase5LinkedHashSetTrain - Preserves bogie insertion order while ensuring uniqueness.
 * LinkedHashSet maintains FIFO order and rejects duplicate entries automatically.
 */
public class UseCase5LinkedHashSetTrain {

    /**
     * Main method - demonstrates LinkedHashSet order preservation and duplicate rejection.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Set<String> trainFormation = new LinkedHashSet<>();

        // Add bogies in order
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        System.out.println("=== Train Formation (Before Duplicate Attempt) ===");
        trainFormation.forEach(bogie -> System.out.println("  " + bogie));

        // Attempt duplicate insertion
        boolean added = trainFormation.add("Sleeper");
        System.out.println("\nAttempted to add 'Sleeper' again. Was added: " + added);

        System.out.println("\n=== Final Train Formation (Order Preserved, No Duplicates) ===");
        trainFormation.forEach(bogie -> System.out.println("  " + bogie));
        System.out.println("Total bogies: " + trainFormation.size());
    }
}
