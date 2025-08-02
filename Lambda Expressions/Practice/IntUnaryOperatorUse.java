import java.util.function.IntUnaryOperator;
public class IntUnaryOperatorUse {
    public static void main(String[] args) {
        int num = 5;
        IntUnaryOperator factorial = n -> {
            int result = 1;
            for(int i=1; i<=num; i++){
                result *= i;
            }
            return result;
        };
        int fact = factorial.applyAsInt(num);
        System.out.println("Factorial of " + num + " : " + fact);
    }
}
