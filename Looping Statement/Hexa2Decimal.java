import java.util.Scanner;

public class Hexa2Decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Hexadecimal number:");
        String hex = sc.nextLine();
        sc.close();
        System.out.println("Hexadecimal Number: " + hex);
        System.out.println("Decimal Number: " + hexa2Decimal(hex));
    }

    public static int hexa2Decimal(String hex){
        int len = hex.length();
        int base = 1;
        int dec = 0;
        for(int i=len-1; i>=0; i--){
            char curr = hex.charAt(i);
            if(curr >= '0' && curr <= '9'){
                // (curr - '0') * base;
                dec += (curr - 48) * base;
            }else if(curr >= 'A' && curr <= 'F'){
                // (curr - 'A' + 10) * base;
                dec += (curr - 55) * base;
            }
            base *= 16;
        }
        return dec;
    }
}
