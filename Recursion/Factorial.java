import java.util.Scanner;
public class Factorial{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            System.out.println("Enter the number: ");
            int n = sc.nextInt();
            System.out.println(factorial(n));
        }
    }

    public static int factorial(int n){
        if(n <= 1) return 1;
        return factorial(n-1) * n;
    }  
}