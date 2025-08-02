public class ReverseDigits {
    public static void main(String[] args) {
        int num = 23634;
        int a = num;
        int sum = 0;
        int rev = 0;
        while(num > 0){
            int rem = num % 10;
            sum += rem;
            rev = rev*10 + rem;
            num /= 10;
        }
        System.out.println("Original Number: "+a);
        System.out.println("Reverse Number: "+rev);
        System.out.println("Sum of its digits: "+sum);
    }
}
