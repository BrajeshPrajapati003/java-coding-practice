import java.util.Scanner;
public class SumOfNaturalNumebers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        // Sum of n Natural numbers
        System.out.println("Sum: "+(n*(n+1)/2));

        // Sum of n Even Natural numbers
        int evenSum = 0;
        for(int i=2; i<=n; i=i+2){
            evenSum += i;
        }
        System.out.println("Sum of Even numbers: "+evenSum);

        // Sum of n Odd numbers
        int oddSum = 0;
        for(int i=1; i<=n; i=i+2){
            oddSum += i;
        }
        System.out.println("Sum of Odd numbers: "+oddSum);
    }
}
