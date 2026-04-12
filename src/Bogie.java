/**
 * Bogie - Represents a train bogie with a name, type, and seating capacity.
 * Shared model used across multiple use cases.
 */
public class Bogie {
    String name;
    String type;
    int capacity;

    public Bogie(String name, String type, int capacity) {
        this.name     = name;
        this.type     = type;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " [" + type + "] – " + capacity + " seats";
    }
}
