import java.math.BigDecimal;
import java.math.RoundingMode; // Note the import for the enum

public class RoundingExample {
    public static void main(String[] args) {
        BigDecimal number = new BigDecimal("66.436770932");
        int decimalPlace = 2;

        // Using setScale with the ROUND_HALF_UP constant (int)
        BigDecimal rounded1 = number.setScale(decimalPlace, BigDecimal.ROUND_HALF_UP);
        System.out.println("Rounded (int constant): " + rounded1);

        // Using setScale with the RoundingMode enum (preferred in newer versions)
        BigDecimal rounded2 = number.setScale(decimalPlace, RoundingMode.HALF_UP);
        System.out.println("Rounded (RoundingMode enum): " + rounded2);
    }
}