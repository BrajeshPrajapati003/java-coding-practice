public class CountOne {
    static int countOnes(int n){
        if(n < 0) return 0;
        int count = 0;
        long factor = 1;

        while(n/factor != 0){
            long currDigit = (n/factor) % 10;
            long higherDigits = n / (factor * 10);
            long lowerDigits = n % factor;

            if(currDigit == 0) count += higherDigits * factor;
            else if(currDigit == 1) count += higherDigits * factor + lowerDigits + 1;
            else count += (higherDigits + 1) * factor;

            if(factor > Integer.MAX_VALUE / 10) break;
            factor *= 10;
        }
        
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Number of Ones: " + countOnes(13));
    }
}
