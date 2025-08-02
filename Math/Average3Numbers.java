import java.util.Scanner;

public class Average3Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        sc.close();

        System.out.println("Average : " + (n1+n2+n3)/3);
    }
}
