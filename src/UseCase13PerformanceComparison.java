import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * UseCase13PerformanceComparison - Compares execution time of loop-based
 * vs stream-based bogie filtering using System.nanoTime().
 */
public class UseCase13PerformanceComparison {

    /**
     * Builds a sample bogie list for benchmarking.
     * @return list of bogies
     */
    private static List<Bogie> buildBogieList() {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper",      "Passenger", 72));
        bogies.add(new Bogie("AC Chair",     "Passenger", 60));
        bogies.add(new Bogie("First Class",  "Passenger", 24));
        bogies.add(new Bogie("Second Class", "Passenger", 90));
        bogies.add(new Bogie("Executive",    "Passenger", 48));
        bogies.add(new Bogie("Fuel Tanker",  "Goods",     0));
        bogies.add(new Bogie("Flat Wagon",   "Goods",     0));
        bogies.add(new Bogie("Pantry",       "Service",   0));
        return bogies;
    }

    /**
     * Filters bogies with capacity > 60 using a traditional for loop.
     * @param bogies source list
     * @return filtered list
     */
    private static List<Bogie> filterWithLoop(List<Bogie> bogies) {
        List<Bogie> result = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.capacity > 60) {
                result.add(b);
            }
        }
        return result;
    }

    /**
     * Filters bogies with capacity > 60 using Stream API.
     * @param bogies source list
     * @return filtered list
     */
    private static List<Bogie> filterWithStream(List<Bogie> bogies) {
        return bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());
    }

    /**
     * Main method - benchmarks loop vs stream filtering performance.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        List<Bogie> bogies = buildBogieList();

        System.out.println("=== Performance Comparison: Loop vs Stream ===");
        System.out.println("Filter condition: capacity > 60\n");

        // Loop benchmark
        long loopStart  = System.nanoTime();
        List<Bogie> loopResult = filterWithLoop(bogies);
        long loopEnd    = System.nanoTime();
        long loopTime   = loopEnd - loopStart;

        // Stream benchmark
        long streamStart  = System.nanoTime();
        List<Bogie> streamResult = filterWithStream(bogies);
        long streamEnd    = System.nanoTime();
        long streamTime   = streamEnd - streamStart;

        System.out.println("Loop   – Results: " + loopResult.size()   + " bogies | Time: " + loopTime   + " ns");
        System.out.println("Stream – Results: " + streamResult.size() + " bogies | Time: " + streamTime + " ns");

        System.out.println("\nFaster approach: "
                + (loopTime < streamTime ? "Loop" : "Stream"));
    }
}
