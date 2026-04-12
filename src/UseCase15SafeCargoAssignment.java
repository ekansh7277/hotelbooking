/**
 * UseCase15SafeCargoAssignment - Validates cargo assignments using try-catch-finally.
 * Ensures program continues after handling unsafe cargo exceptions.
 */
public class UseCase15SafeCargoAssignment {

    /**
     * Assigns cargo to a bogie type after compatibility check.
     * Rule: Cylindrical bogies accept only Petroleum.
     *       Flat bogies accept only Steel or Machinery.
     *       Box bogies accept only Grain or Packaged Goods.
     *
     * @param bogieType the type of bogie
     * @param cargo     the cargo to assign
     * @throws CargoSafetyException if cargo is incompatible with bogie type
     */
    public static void assignCargo(String bogieType, String cargo) throws CargoSafetyException {
        boolean safe = switch (bogieType) {
            case "Cylindrical" -> cargo.equals("Petroleum");
            case "Flat"        -> cargo.equals("Steel") || cargo.equals("Machinery");
            case "Box"         -> cargo.equals("Grain") || cargo.equals("Packaged Goods");
            default            -> false;
        };

        if (!safe) {
            throw new CargoSafetyException(bogieType, cargo);
        }
        System.out.println("ASSIGNED : " + cargo + " → " + bogieType + " bogie");
    }

    /**
     * Main method - demonstrates safe cargo assignment with try-catch-finally.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        System.out.println("=== Safe Cargo Assignment ===\n");

        String[][] assignments = {
                {"Cylindrical", "Petroleum"},
                {"Cylindrical", "Chemicals"},
                {"Flat",        "Steel"},
                {"Box",         "Petroleum"},
                {"Box",         "Grain"}
        };

        for (String[] a : assignments) {
            try {
                assignCargo(a[0], a[1]);
            } catch (CargoSafetyException e) {
                System.out.println("SAFETY ERROR: " + e.getMessage());
            } finally {
                System.out.println("  [Audit] Assignment attempt for " + a[0] + " logged.\n");
            }
        }

        System.out.println("All cargo assignments processed. System stable.");
    }
}
