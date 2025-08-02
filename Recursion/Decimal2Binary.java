import java.util.Scanner;
public class Decimal2Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int dec = sc.nextInt();
        sc.close();
        int bin = decimal2Binary(dec);
        System.out.println("The binary representation: " + bin);
    }

    public static int decimal2Binary(int dec){
        if(dec == 0) return 0;
        else return (dec % 2 + 10 * decimal2Binary(dec/2));
    }
}