import java.util.Scanner;

public class Radian_Degree{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radian = 0;
        System.out.println("Enter Radian Value:");
        radian = sc.nextDouble();
        double deg = Math.toDegrees(radian);
        System.out.println("Degree is: " + deg);
        sc.close();
    }
}