
public class ReverseFactorial{
    static long reverseFactorial(long x){
        long i = 1;
        while(x % i == 0){
            x /= i;
            if(x == 1) return i;
            i++;
        }
        return -1;
    }

    public static void main(String[] args) {
        long ans = reverseFactorial(130);
        System.out.println(ans);
    }
}