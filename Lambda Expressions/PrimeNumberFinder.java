
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PrimeNumberFinder {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9);
        List<Integer> primeNumbers = filterPrimeNumbers(list);

        System.out.println("List of numbers: " + list);
        System.out.println("Prime numbers: " + primeNumbers);

        // Example using streams directly
        List<Integer> primeNumbersStream = list.stream().filter(PrimeNumberFinder::isPrime).collect(Collectors.toList());
        System.out.println("Prime Numbers (stream): " + primeNumbersStream);
    }

    public static List<Integer> filterPrimeNumbers(List<Integer> numbers){
        Predicate<Integer> isPrime = num -> {
            if(num <= 1) return false;
            for(int i=2; i<= Math.sqrt(num); i++){
                if(num % i == 0) return false;
            }
            return true;
        };

        List<Integer> primeNumbers = new ArrayList<>();
        for(int num: numbers){
            if(isPrime.test(num)){
                primeNumbers.add(num);
            }
        }
        return primeNumbers;
    }

    public static boolean isPrime(int num){
        if(num <= 1) return false;
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num % i == 0) return false;
        }
        return true;
    }
}
