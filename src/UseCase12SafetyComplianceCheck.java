import java.util.ArrayList;
import java.util.List;

/**
 * UseCase12SafetyComplianceCheck - Ensures goods bogies follow safety compliance rules.
 * Rule: Cylindrical bogies may only carry Petroleum cargo.
 * Uses Stream allMatch() to verify the entire fleet.
 */
public class UseCase12SafetyComplianceCheck {

    /**
     * Represents a goods bogie with shape and cargo type.
     */
    static class GoodsBogie {
        String name;
        String shape;
        String cargo;

        GoodsBogie(String name, String shape, String cargo) {
            this.name  = name;
            this.shape = shape;
            this.cargo = cargo;
        }

        @Override
        public String toString() {
            return name + " [" + shape + "] carrying " + cargo;
        }
    }

    /**
     * Main method - validates safety compliance using allMatch on goods bogies.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        List<GoodsBogie> goodsBogies = new ArrayList<>();
        goodsBogies.add(new GoodsBogie("Tanker-01",  "Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Tanker-02",  "Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("FlatWagon-01","Flat",       "Steel"));
        goodsBogies.add(new GoodsBogie("BoxWagon-01", "Box",        "Grain"));

        System.out.println("=== Goods Bogie Fleet ===");
        goodsBogies.forEach(b -> System.out.println("  " + b));

        boolean isCompliant = goodsBogies.stream()
                .allMatch(b -> !b.shape.equals("Cylindrical") || b.cargo.equals("Petroleum"));

        System.out.println("\n=== Safety Compliance Result ===");
        System.out.println("All cylindrical bogies carry only Petroleum: "
                + (isCompliant ? "COMPLIANT ✓" : "NON-COMPLIANT ✗"));

        // Non-compliant scenario
        goodsBogies.add(new GoodsBogie("Tanker-03", "Cylindrical", "Chemicals"));
        System.out.println("\nAdded Tanker-03 [Cylindrical] carrying Chemicals...");

        boolean isCompliantAfter = goodsBogies.stream()
                .allMatch(b -> !b.shape.equals("Cylindrical") || b.cargo.equals("Petroleum"));

        System.out.println("Re-check compliance: "
                + (isCompliantAfter ? "COMPLIANT ✓" : "NON-COMPLIANT ✗"));
    }
}
