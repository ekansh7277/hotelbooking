import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * UseCase9GroupBogiesByType - Groups bogies into categories using Collectors.groupingBy.
 * Result is stored in Map&lt;String, List&lt;Bogie&gt;&gt; keyed by bogie type.
 */
public class UseCase9GroupBogiesByType {

    /**
     * Main method - demonstrates groupingBy collector on bogie type field.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper",      "Passenger", 72));
        bogies.add(new Bogie("AC Chair",     "Passenger", 60));
        bogies.add(new Bogie("First Class",  "Passenger", 24));
        bogies.add(new Bogie("Fuel Tanker",  "Goods",     0));
        bogies.add(new Bogie("Flat Wagon",   "Goods",     0));
        bogies.add(new Bogie("Pantry",       "Service",   0));
        bogies.add(new Bogie("Guard Van",    "Service",   0));

        Map<String, List<Bogie>> grouped = bogies.stream()
                .collect(Collectors.groupingBy(b -> b.type));

        System.out.println("=== Bogies Grouped by Type ===\n");
        grouped.forEach((type, list) -> {
            System.out.println("[ " + type + " ]");
            list.forEach(b -> System.out.println("  " + b));
            System.out.println();
        });
    }
}
