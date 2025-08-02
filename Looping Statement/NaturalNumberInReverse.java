import java.util.Scanner;
public class NaturalNumberInReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting numbers:");
        int start = sc.nextInt();
        System.out.println("Enter the ending number:");
        int end = sc.nextInt();

        sc.close();
        while(start <= end){
            System.out.print(end+" ");
            end--;
        }
    }
}
