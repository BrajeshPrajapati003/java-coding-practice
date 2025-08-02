import java.util.Scanner;
public class ReverseNumber {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     sc.close();
    //     int digits = n;
    //     int len = 0;
    //     while(digits>0){
    //         digits /= 10;
    //         len++;
    //     }
    //     int reverse = reverseDigit(n, len);
    //     System.out.println("Reverse Digits: "+reverse);
    // }

    // public static int reverseDigit(int n, int len){
    //     if(len != 1){
    //         return (((n % 10) * (int) Math.pow(10, len-1)) + reverseDigit(n/10, --len));
    //     }
    //     return n;
    // }

    //? There's a simpler way to achieve this without calculating the length of the number in advance.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int reversed = reverseDigits(n);
        System.out.println("Reversed Number: "+reversed);
    }

    public static int reverseDigits(int n){
        return reverseHelper(n, 0);
    }

    public static int reverseHelper(int n, int reversed){
        if(n == 0){
            return reversed;
        }
        reversed = reversed * 10 + n % 10;
        return reverseHelper(n/10, reversed);
    }
}