public class CheckPerfectNumber {
    public boolean checkPerfectNumber(int num) {
        // A perfect number cannot be less than or equal to 1
        if (num <= 1) {
            return false;
        }

        // Start with 1 because 1 is a divisor of any number
        int sum = 1;

        // Iterate up to the square root of num to find divisors
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;
                if (i != num / i) {
                    sum += num / i;
                }
            }
        }

        // Return true if sum of divisors equals num
        return sum == num;
    }
}