import java.util.ArrayList;
import java.util.List;

public class FindPrimes {
    public static List<Integer> findPrimesUptoN(int n){
        if(n<2){
            return new ArrayList<>(); // No prime numbers less than 2
        }

        boolean[] isPrime = new boolean[n+1];

        // Initially mark all numbers as prime
        for(int i=2; i<=n; i++){
            isPrime[i] = true;
        }

        // Sieve of Eratosthenes algo
        for(int p = 2; p*p <= n; p++){
            // If p is prime, mark all its multiples as not prime
            if(isPrime[p]){
                for(int i = p*p; i <= n; i += p){
                    isPrime[i] = false;
                }
            }
        }

        // Collect all prime numbers into a list
        List<Integer> primes = new ArrayList<>();
        for(int i=2; i<=n; i++){
            if(isPrime[i]) primes.add(i);
        }

        return primes;
    }

    public static void main(String[] args) {
        int limit = 30;
        List<Integer> primeNumbers = findPrimesUptoN(limit);
        System.out.println("Prime numbers upto " + limit + ": " + primeNumbers);
    }
}
