/**
 * InvalidCapacityException - Thrown when a bogie is created with a capacity of zero or less.
 */
public class InvalidCapacityException extends Exception {
    public InvalidCapacityException(int capacity) {
        super("Invalid bogie capacity: " + capacity + ". Capacity must be greater than 0.");
    }
}
