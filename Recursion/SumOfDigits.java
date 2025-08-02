import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        long num = sc.nextInt();
        sc.close();
        System.out.println("Sum of the Digits: "+sumOfDigits(num));
    }

    // static int sum = 0;
    // public static int sumOfDigits(long n){
    //     if(n>0){
    //         sum += (n%10);
    //         sumOfDigits(n/10);
    //     }
    //     return sum;
    // }

    // using a static variable for the sum is not ideal because it retains its value between different calls, which can lead to incorrect results when used multiple times. It's better to keep the method purely recursive.

    public static long sumOfDigits(long num){
        if(num==0){
            return 0;
        }
        return (int)(num%10) + sumOfDigits(num/10);
    }
}