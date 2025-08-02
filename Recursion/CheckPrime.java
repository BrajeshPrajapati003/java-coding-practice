import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        sc.close();
        boolean res = checkPrime(num, (int) Math.sqrt(num));
        if (res) {
            System.out.println("This is a prime number.");
        } else {
            System.out.println("This is not a prime number.");
        }
    }

    public static boolean checkPrime(int num, int i) {
        if (num <= 1) return false;

        // Handle 2 and 3 explicitly
        if (num <= 3) return true;

        // Base case: reached 1 (checked all the way down)
        if (i <= 1) return true;

        if (num % i == 0)
            // Divisible, not prime
            return false;
        else 
            // Check the next smaller number
            return checkPrime(num, i - 1);
    }
}