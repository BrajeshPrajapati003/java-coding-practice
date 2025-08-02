import java.util.Scanner;
import java.util.Stack;

public class Decimal2Binary {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter a decimal number: ");
            int decimal = sc.nextInt();
            System.out.println("Decimal Number: " + decimal);
            String binary = convert2Binary(decimal);
            System.out.println("Binary Number: " + binary);
        }
    }

    public static String convert2Binary(int decimal){
        if(decimal == 0) return "0";

        Stack<Integer> stack = new Stack<>();
        while(decimal>0){
            int rem = decimal % 2;
            stack.push(rem);
            decimal /= 2;
        }

        StringBuilder binary = new StringBuilder();
        while(!stack.isEmpty()){
            binary.append(stack.pop());
        }
        return binary.toString();
    }
}
