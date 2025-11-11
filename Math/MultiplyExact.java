import java.util.Scanner;

public class MultiplyExact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.MIN_VALUE;
        try {
            System.out.println("Product " + Math.multiplyExact(12, 25)); // 12+25
            System.out.println("subtraction: " + Math.subtractExact(12, 25)); // 12-25
            
            System.out.println("Product: " + Math.multiplyExact(num, 3)); // ArithmeticException due to integer overflow

        } catch (Exception e) {
            System.out.println("exception: " + e);
        }
    }
}
