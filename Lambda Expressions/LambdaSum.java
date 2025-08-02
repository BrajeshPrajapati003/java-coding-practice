import java.util.Scanner;
interface SumCalculator{
    int sum(int a, int b);
}
public class LambdaSum{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in);){
            SumCalculator calc = (a,b) -> a+b;
            System.out.println("Enter the two numbers: ");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int result = calc.sum(num1, num2);
            System.out.println("Sum: " + result);
        }
    }
}