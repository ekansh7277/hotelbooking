import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * UseCase11ValidateTrainIDAndCargoCodes - Validates Train IDs and Cargo Codes
 * using Regular Expressions with Pattern and Matcher.
 *
 * Train ID pattern  : TRN-\d{4}       e.g. TRN-1042
 * Cargo Code pattern: PET-[A-Z]{2}    e.g. PET-AB
 */
public class UseCase11ValidateTrainIDAndCargoCodes {

    private static final Pattern TRAIN_ID_PATTERN    = Pattern.compile("TRN-\\d{4}");
    private static final Pattern CARGO_CODE_PATTERN  = Pattern.compile("PET-[A-Z]{2}");

    /**
     * Validates a Train ID against the TRN-\d{4} pattern.
     * @param trainId the train ID string to validate
     * @return true if valid, false otherwise
     */
    public static boolean isValidTrainId(String trainId) {
        Matcher matcher = TRAIN_ID_PATTERN.matcher(trainId);
        return matcher.matches();
    }

    /**
     * Validates a Cargo Code against the PET-[A-Z]{2} pattern.
     * @param cargoCode the cargo code string to validate
     * @return true if valid, false otherwise
     */
    public static boolean isValidCargoCode(String cargoCode) {
        Matcher matcher = CARGO_CODE_PATTERN.matcher(cargoCode);
        return matcher.matches();
    }

    /**
     * Main method - runs validation test cases for Train IDs and Cargo Codes.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        String[] trainIds   = {"TRN-1042", "TRN-99", "TRN-ABCD", "TRN-5678", "TR-1234"};
        String[] cargoCodes = {"PET-AB", "PET-abc", "PET-A", "PET-XY", "PETAB"};

        System.out.println("=== Train ID Validation (Pattern: TRN-\\d{4}) ===");
        for (String id : trainIds) {
            System.out.printf("  %-12s -> %s%n", id, isValidTrainId(id) ? "VALID" : "INVALID");
        }

        System.out.println("\n=== Cargo Code Validation (Pattern: PET-[A-Z]{2}) ===");
        for (String code : cargoCodes) {
            System.out.printf("  %-10s -> %s%n", code, isValidCargoCode(code) ? "VALID" : "INVALID");
        }
    }
}
