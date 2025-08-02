import java.util.Scanner;

public class Decimal2Octal2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        int dec = sc.nextInt();
        sc.close();
        System.out.println("Octal number: " + toOctal(dec));
    }

    public static int toOctal(int dec){
        if(dec == 0) return 0;
        else{
            int rem = dec % 8;
            int octalPart = toOctal(dec / 8);
            return octalPart * 10 + rem;
        }
    }
}