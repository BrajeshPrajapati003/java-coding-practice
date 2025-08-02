import java.util.Scanner;
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bin = sc.next();
        sc.close();

        int dec = binaryToDecimal(bin, 0);
        System.out.println("Decimal number: " + dec);
    }

    public static int binaryToDecimal(String bin, int ind){
        int len = bin.length();
        if(ind == len-1) return bin.charAt(ind)-'0';
        // Left shift by (len - ind - 1) = multiplying by 2^(len - ind - 1)
        return ((bin.charAt(ind) - '0') << (len - ind - 1)) + binaryToDecimal(bin, ind+1);
    }
}
