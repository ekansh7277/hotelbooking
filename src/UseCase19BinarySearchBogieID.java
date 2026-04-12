import java.util.Arrays;

/**
 * UseCase19BinarySearchBogieID - Searches for a bogie ID efficiently using Binary Search.
 * Array is sorted first, then binary search is applied using compareTo().
 */
public class UseCase19BinarySearchBogieID {

    /**
     * Performs binary search for a target bogie ID in a sorted array.
     * @param bogieIds sorted array of bogie IDs
     * @param target   the bogie ID to find
     * @return index of the found ID, or -1 if not found
     */
    public static int binarySearch(String[] bogieIds, String target) {
        int low  = 0;
        int high = bogieIds.length - 1;

        while (low <= high) {
            int mid    = (low + high) / 2;
            int result = bogieIds[mid].compareTo(target);

            if (result == 0) {
                return mid;
            } else if (result < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    /**
     * Main method - demonstrates binary search on sorted bogie ID array.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        String[] bogieIds = {"BG-518", "BG-101", "BG-412", "BG-203", "BG-620", "BG-305"};

        System.out.println("=== Binary Search for Bogie ID ===");
        System.out.println("Before sort: " + Arrays.toString(bogieIds));

        Arrays.sort(bogieIds);
        System.out.println("After sort : " + Arrays.toString(bogieIds));

        String[] targets = {"BG-412", "BG-999"};

        for (String target : targets) {
            int index = binarySearch(bogieIds, target);
            if (index != -1) {
                System.out.println("\nSearching for \"" + target + "\" → FOUND at index " + index);
            } else {
                System.out.println("\nSearching for \"" + target + "\" → NOT FOUND");
            }
        }
    }
}
