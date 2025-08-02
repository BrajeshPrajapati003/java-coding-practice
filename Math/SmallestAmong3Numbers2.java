import java.util.Scanner;

public class SmallestAmong3Numbers2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        sc.close();

        System.out.println("Smallest Number: " + Math.min(Math.min(n1,n2), n3));
    }
}
