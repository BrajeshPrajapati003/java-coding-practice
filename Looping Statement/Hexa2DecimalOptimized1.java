public class Hexa2DecimalOptimized1 {

    public static int hexa2Decimal(String hex) {
        int decimal = 0;
        if (hex == null || hex.isEmpty()) {
            throw new IllegalArgumentException("Input hexadecimal string cannot be null or empty.");
        }

        String normalizedHex = hex.toUpperCase(); 

        for (int i = 0; i < normalizedHex.length(); i++) {
            char c = normalizedHex.charAt(i);
            // Get the integer value of the hex digit
            int digitValue = Character.digit(c, 16);

            if (digitValue == -1) {
                // If Character.digit returns -1, it means the character is not a valid hex digit
                throw new IllegalArgumentException("Invalid hexadecimal character: '" + c + "' in string: " + hex);
            }
            
            decimal = decimal * 16 + digitValue;
        }
        return decimal;
    }

    public static void main(String[] args) {
        // Test cases
        String hex1 = "1A";
        String hex2 = "FF";
        String hex3 = "100";
        String hex4 = "abc"; // Test lowercase
        String hex5 = "DEADBEEF"; // Longer hex string
        String hex6 = "0"; // Single digit
        String hex7 = "GHI"; // Invalid character

        System.out.println("--- Hex to Decimal Conversion Tests ---");

        // Test valid hexadecimal strings
        System.out.println("Hex: " + hex1 + " -> Decimal: " + hexa2Decimal(hex1)); // Expected: 26
        System.out.println("Hex: " + hex2 + " -> Decimal: " + hexa2Decimal(hex2)); // Expected: 255
        System.out.println("Hex: " + hex3 + " -> Decimal: " + hexa2Decimal(hex3)); // Expected: 256
        System.out.println("Hex: " + hex4 + " -> Decimal: " + hexa2Decimal(hex4)); // Expected: 2748 (ABC in hex)
        System.out.println("Hex: " + hex5 + " -> Decimal: " + hexa2Decimal(hex5)); // Expected: 3735928559
        System.out.println("Hex: " + hex6 + " -> Decimal: " + hexa2Decimal(hex6)); // Expected: 0

        // Test with invalid hexadecimal string to demonstrate error handling
        System.out.println("\n--- Testing Invalid Input ---");
        try {
            System.out.println("Hex: " + hex7 + " -> Decimal: " + hexa2Decimal(hex6));
        } catch (IllegalArgumentException e) {
            System.out.println("Error for '" + hex7 + "': " + e.getMessage());
        }

        // Test with null input
        try {
            System.out.println("Hex: null -> Decimal: " + hexa2Decimal(null));
        } catch (IllegalArgumentException e) {
            System.out.println("Error for null input: " + e.getMessage());
        }

        // Test with empty string
        try {
            System.out.println("Hex: \"\" -> Decimal: " + hexa2Decimal(""));
        } catch (IllegalArgumentException e) {
            System.out.println("Error for empty input: " + e.getMessage());
        }
    }
}