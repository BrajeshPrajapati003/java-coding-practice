import java.util.Scanner;

public class Hexa2DecimalOptimized2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Hexadecimal number:");
        String hex = sc.nextLine();
        sc.close();
        System.out.println("Hexadecimal Number: " + hex);
        System.out.println("Decimal Number: " + hexa2Decimal(hex));
    }

    public static int hexa2Decimal(String hex){
        int dec = 0;

        for(int i=0; i<hex.length(); i++){
            char c = hex.charAt(i);
            int digitValue;

            if(c >= '0' && c <= '9'){
                digitValue = c - '0';
            }else if(c >= 'A' && c <= 'F'){
                digitValue = c - 'a' + 10;
            }else{
                throw new IllegealArgumentException("Invalid hexadecimal character: " + c);
            }

            dec = dec * 16 + digitValue;
        }
        return dec;
    }
}
