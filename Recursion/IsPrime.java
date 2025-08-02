import java.util.Scanner;
public class IsPrime {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean res = checkPrime(num, 2);
        if(res) System.out.println("Prime number");
        else System.out.println("Not a prime number");
        sc.close();
    }

    public static boolean checkPrime(int num, int i){
        // 1 and numbers <= 0 are not prime
        if(num <= 1) return false;
        // 2 and 3 are prime
        if(num <= 3) return true;
        // check divisibility by 2 and 3
        if(num%2 == 0 || num%3 == 0) return false;
        // Base case: checked upto sqrt(n)
        if(i*i > num) return true;
        // Divisible by i, not prime
        if(num%i == 0) return false;
        // Recursive call: check next number
        return checkPrime(num, i+1);
    }
}