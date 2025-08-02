import java.util.Scanner;

public class SumDifference {
    public static void main(String[] args) {
        // Take 2 numbers, return true if either of the two number is 15 or if their sum or differnce is 15
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        sc.close();

        if(n1==15 || n2==15 || n1+n2 == 15 || Math.abs(n1-n2) == 15){
            System.out.println(true);
        }else System.out.println(false);
    }
}
