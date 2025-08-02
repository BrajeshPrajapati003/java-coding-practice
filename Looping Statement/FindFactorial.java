import java.util.Scanner;
public class FindFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        long fact = 1;
        for(int i=2; i<=n; i++){
            fact *= i;
        }
        System.out.println("factorial of "+n+": "+fact);
    }
}
