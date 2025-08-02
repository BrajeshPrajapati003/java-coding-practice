import java.util.List;
public class SumOfPrimes {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 3, 4, 5, 6, 7, 8);
        System.out.println("Original numbers: " + numbers);
        int sumOfPrimeNumbers = numbers.stream().filter(SumOfPrimes::isPrime).mapToInt(Integer::intValue).sum();
        System.out.println("Sum of prime numbers: " + sumOfPrimeNumbers);
    }

    public static boolean isPrime(int num){
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num % i == 0) return false;
        }
        return true;
    }
}
