
import java.util.Scanner;

public class Logarithmic {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the number:");
            double num = sc.nextDouble();
            System.out.println("Logarithmic Value of Number is: " + Math.log(num));
        }
    }
}
