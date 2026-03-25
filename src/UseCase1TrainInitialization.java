import java.util.ArrayList;
import java.util.List;

/**
 * UseCase1TrainInitialization - Application entry point for Train Consist Management App.
 * Initializes an empty train consist and displays the initial bogie count.
 */
public class UseCase1TrainInitialization {

    /**
     * Main method - application entry point.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        List<String> trainConsist = new ArrayList<>();

        System.out.println("Train consist initialized.");
        System.out.println("Initial bogie count: " + trainConsist.size());
    }
}
