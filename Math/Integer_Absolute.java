import java.util.Scanner;

public class Integer_Absolute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer number:");
        int n = sc.nextInt();
        sc.close();
        int absValue = (n>=0) ? n : -n;
        System.out.println("Given value: " + n);
        System.out.println("Convert Integer to Absolute value: " + absValue);
    }
}
