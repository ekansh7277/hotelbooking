/**
 * UseCase14InvalidBogieCapacity - Prevents creation of passenger bogies with invalid capacity.
 * Throws InvalidCapacityException when capacity is zero or negative.
 */
public class UseCase14InvalidBogieCapacity {

    /**
     * PassengerBogie - A bogie that validates its capacity on construction.
     */
    static class PassengerBogie {
        String name;
        int capacity;

        /**
         * Constructs a PassengerBogie with validated capacity.
         * @param name     bogie name
         * @param capacity seating capacity (must be > 0)
         * @throws InvalidCapacityException if capacity is zero or negative
         */
        PassengerBogie(String name, int capacity) throws InvalidCapacityException {
            if (capacity <= 0) {
                throw new InvalidCapacityException(capacity);
            }
            this.name     = name;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return name + " – " + capacity + " seats";
        }
    }

    /**
     * Main method - demonstrates fail-fast validation using custom exception.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        System.out.println("=== Invalid Bogie Capacity Handling ===\n");

        String[][] testCases = {
                {"Sleeper",     "72"},
                {"AC Chair",    "-5"},
                {"First Class", "0"},
                {"Executive",   "48"}
        };

        for (String[] tc : testCases) {
            try {
                PassengerBogie bogie = new PassengerBogie(tc[0], Integer.parseInt(tc[1]));
                System.out.println("CREATED  : " + bogie);
            } catch (InvalidCapacityException e) {
                System.out.println("ERROR    : " + e.getMessage());
            }
        }
    }
}
