import java.util.Scanner;
public class Decimal2Octal {
    static int temp = 1;
    static int oct = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the decimal number: ");
        int dec = sc.nextInt();
        sc.close();
        System.out.println("Octal number: " + deci2Octal(dec));
    }

    public static int deci2Octal(int dec){
        if(dec != 0){
            oct = oct + (dec % 8) * temp;
            temp = temp * 10;
            deci2Octal(dec / 8);
        }
        return oct;
    }
}