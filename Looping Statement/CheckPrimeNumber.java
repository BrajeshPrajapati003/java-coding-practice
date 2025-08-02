public class CheckPrimeNumber {
    public static void main(String[] args) {
        int n = 71;
        boolean nonPrime = false;
        for(int i=2; i<Math.sqrt(n); i++){
            if(n % i == 0){
                nonPrime = true;
                break;
            }
        }
        if(nonPrime) System.out.println(n+" is not a Prime number");
        else System.out.println(n+" is a prime number");
    }
}