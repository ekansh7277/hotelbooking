/**
 * CargoSafetyException - Thrown when an incompatible cargo is assigned to a bogie.
 */
public class CargoSafetyException extends Exception {
    public CargoSafetyException(String bogieType, String cargo) {
        super("Unsafe assignment: cargo \"" + cargo + "\" is not compatible with bogie type \"" + bogieType + "\".");
    }
}
