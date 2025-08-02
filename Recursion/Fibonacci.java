import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.printf("Enter the number of terms: ");
            int n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Please enter a positive integer.");
            } else if (n == 1) {
                System.out.printf("Fibonacci Series: 0");
            } else {
                System.out.printf("Fibonacci Series: 0 1");
                printFibonacci(0, 1, n - 2);
            }
        }
    }

    public static void printFibonacci(int a, int b, int n) {
        if (n > 0) {
            int sum = a + b;
            System.out.printf(" %d", sum);
            printFibonacci(b, sum, n - 1);
        }
    }
}