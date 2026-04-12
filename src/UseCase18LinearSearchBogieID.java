/**
 * UseCase18LinearSearchBogieID - Searches for a bogie ID using Linear Search.
 * Traverses the array sequentially and stops when the target is found.
 */
public class UseCase18LinearSearchBogieID {

    /**
     * Performs a linear search for a target bogie ID in the array.
     * @param bogieIds array of bogie IDs to search
     * @param target   the bogie ID to find
     * @return index of the found ID, or -1 if not found
     */
    public static int linearSearch(String[] bogieIds, String target) {
        for (int i = 0; i < bogieIds.length; i++) {
            if (bogieIds[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Main method - demonstrates linear search on bogie ID array.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        String[] bogieIds = {"BG-101", "BG-203", "BG-305", "BG-412", "BG-518", "BG-620"};

        System.out.println("=== Linear Search for Bogie ID ===");
        System.out.println("Bogie IDs: ");
        for (String id : bogieIds) System.out.print("  " + id);
        System.out.println();

        String[] targets = {"BG-305", "BG-999"};

        for (String target : targets) {
            int index = linearSearch(bogieIds, target);
            if (index != -1) {
                System.out.println("\nSearching for \"" + target + "\" → FOUND at index " + index);
            } else {
                System.out.println("\nSearching for \"" + target + "\" → NOT FOUND");
            }
        }
    }
}
