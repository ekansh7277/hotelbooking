import java.util.Arrays;

/**
 * UseCase17SortBogieNames - Sorts bogie names alphabetically
 * using the built-in Arrays.sort() method.
 */
public class UseCase17SortBogieNames {

    /**
     * Main method - demonstrates Arrays.sort() on bogie name array.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        String[] bogieNames = {"Sleeper", "AC Chair", "Guard Van", "First Class",
                               "Pantry", "Engine", "Cargo", "Executive"};

        System.out.println("=== Sort Bogie Names Alphabetically ===");
        System.out.println("Before: " + Arrays.toString(bogieNames));

        Arrays.sort(bogieNames);

        System.out.println("After : " + Arrays.toString(bogieNames));
    }
}
