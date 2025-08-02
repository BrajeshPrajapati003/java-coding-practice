import java.util.BitSet;
import java.util.Scanner;

public class CountPrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        System.out.println("Number of prime numbers: " + countPrimes(num));
        sc.close();
    }

    public static int countPrimes(int n){
        // Handle base cases for n less than 2 and n equal to 3
        if(n < 2 ) return 0;
        else if(n == 2) return 1; // 2 is the first prime number

        // Create a BitSet to keep track of composite numbers.
        // Initially, all bits are false, meaning all numbers are assumed to be prime.
        BitSet set = new BitSet(n);

        // Initialize the count of prime numbers. We start by assuming all numbers
        // from 2 up to n-1 are prime.
        int count = n - 2;

        // Calculate the square root of n-1. We only need to iterate up to this limit
        // because if a number 'n' has a divisor larger than its square root, it must
        // also have a divisor smaller than its square root.
        int sqrt = (int) Math.sqrt(n - 1);

        // Iterate from 2 up to the square root of n-1
        for(int i = 2; i <= sqrt; i++){
            // If the bit at index 'i' is false, it means 'i' is a prime number
            if(!set.get(i)){
                // Mark all multiples of 'i' starting from i*i as composite (not prime)
                for(int j = i * i; j < n; j += i){
                    // If the bit at index 'j' is not yet set (still considered prime)
                    if(!set.get(j)){
                        // Set the bit at index 'j' to true, indicating it's composite
                        set.set(j);
                        // Decrement the count of prime numbers
                        count--;
                    }
                }
            }
        }
        // After the loop, 'count' holds the number of prime numbers less than n.
        return count;
    }
}