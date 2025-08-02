public class FactorialCalculator {
    static long calcFactorial(int... numbers){
        long result = 1;
        for(int num: numbers){
            for(int i=1; i<=num; i++){
                result *= i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        long fact = calcFactorial(2,3,5);
        System.out.println("Fatorial: " + fact);
    }
}
