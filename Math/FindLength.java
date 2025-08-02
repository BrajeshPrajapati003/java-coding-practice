import java.util.Scanner;

public class FindLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Renamed Scanner object to 'scanner'
        System.out.println("Enter a non-negative integer:");
        int decimalNumber = sc.nextInt();
        int quotient = decimalNumber;
        int binIdx = 1;
        int[] binaryNumArr = new int[100];

        // Convert decimal to binary by repeatedly dividing by 2
        while (quotient != 0) {
            binaryNumArr[binIdx++] = quotient % 2;
            quotient /= 2;
        }

        String binaryStr = " ";

        // Iterate through the binary digits in reverse order to form the binary string
        for (int j = binIdx - 1; j > 0; j--) {
            binaryStr = binaryStr + binaryNumArr[j];
        }
        System.out.println("Binary number: " + binaryStr);

        int lastNonZeroIndex = binaryStr.length() - 1;

        // Find the index of the last '1' to ignore trailing zeros
        while (lastNonZeroIndex >= 0 && binaryStr.charAt(lastNonZeroIndex) == '0') {
            lastNonZeroIndex--;
        }

        int longestLength = 0;
        int currentLength = 0;

        // Iterate through the binary string (up to the last '1') to find the longest sequence of zeros
        for (int i = 1; i < binaryStr.length(); i++) { // Start from index 1 to align with original logic
            if (binaryStr.charAt(i) == '1') {
                // Update longestLength if currentLength is greater
                longestLength = Math.max(longestLength, currentLength);
                currentLength = 0; // Reset currentLength when '1' is encountered
            } else {
                currentLength++; // Increment currentLength when '0' is encountered
            }
        }
        longestLength = Math.max(longestLength, currentLength); // Check for trailing zeros at the end of the relevant part

        System.out.println("Length of the longest sequence: " + longestLength);
        sc.close();
    }
}