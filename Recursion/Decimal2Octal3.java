import java.util.Scanner;

public class Decimal2Octal3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the decimal number: ");
        int dec = sc.nextInt();
        sc.close();
        System.out.println("Octal number: " + decimal2Octal(dec));
    }

    public static String decimal2Octal(int dec){
        // Initialize a StringBuilder to efficiently build the octal string.
        return decimal2OctalRecursive(dec, new StringBuilder());
    }

    public static String decimal2OctalRecursive(int dec, StringBuilder octal){
        // Base case: return the accumulated octal string
        if(dec == 0) return octal.toString();
        else{
            // Calculate the last octal digit
            int rem = dec % 8;

            // Insert the rem at the beginning of the StringBuilder
            // This is how we build the octal representation from right to left
            octal.insert(0, rem);

            // Recursively call the function with the quotient (dec/8) and the updated octal StringBuilder.
            return decimal2OctalRecursive(dec / 8, octal);
        }
    }
}
