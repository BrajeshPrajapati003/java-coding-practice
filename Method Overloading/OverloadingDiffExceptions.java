public class OverloadingDiffExceptions {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Result of division: " + calc.divide(10, 2));
        try {
            System.out.println("Result of division (with exception): " + calc.divide(10, 5, 0));
        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

class Calculator{
    int divide(int a, int b){
        return a/b;
    }

    int divide(int a, int b, int c){
        if(c == 0){
            throw new ArithmeticException("Division by zero");
        }
        return (a/b)/c;
    }
}