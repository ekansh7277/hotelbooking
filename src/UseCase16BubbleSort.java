import java.util.Arrays;

/**
 * UseCase16BubbleSort - Manually sorts passenger bogie capacities
 * using the Bubble Sort algorithm with nested loops and swap logic.
 */
public class UseCase16BubbleSort {

    /**
     * Sorts an integer array in ascending order using Bubble Sort.
     * @param capacities array of bogie capacities to sort
     */
    public static void bubbleSort(int[] capacities) {
        int n = capacities.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (capacities[j] > capacities[j + 1]) {
                    int temp          = capacities[j];
                    capacities[j]     = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }
    }

    /**
     * Main method - demonstrates Bubble Sort on bogie capacity array.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        int[] capacities = {72, 24, 90, 60, 48};

        System.out.println("=== Bubble Sort – Bogie Capacities ===");
        System.out.println("Before: " + Arrays.toString(capacities));

        bubbleSort(capacities);

        System.out.println("After : " + Arrays.toString(capacities));
    }
}
