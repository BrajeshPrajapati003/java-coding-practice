import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter a number: ");
            int n = sc.nextInt();
            int count = totalDigits(n);
            System.out.println("Number of digits: "+count);
        }
    }
    static int count = 0;
    public static int totalDigits(int num){
        if(num>0){
            count++;
            totalDigits(num/10);
        }
        return count;
    }
}