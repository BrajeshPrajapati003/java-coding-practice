import java.util.Scanner;

public class CeilingOPeration {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number:");
            double num = sc.nextInt();
            System.out.println("Number after ceiling operation: " + Math.ceil(num));
        }
    }
}
