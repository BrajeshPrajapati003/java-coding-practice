import java.util.Scanner;

public class Decimal2Binary2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        int dec = sc.nextInt();
        sc.close();
        String bin = decimalToBinary(dec);
        System.out.println("The binary representation: " + bin);
    }
   
    public static String decimalToBinary(int dec){
        if(dec == 0){
            // Handle the base case explicitly
            return "0";
        }
        StringBuilder binary = new StringBuilder();
        while(dec > 0){
            int rem = dec % 2;
            // Append the remainder 0 or 1
            binary.append(rem);
            // Integer division
            dec /= 2;
        }
        // Reverse and convert to string
        return binary.reverse().toString();
    }
}
