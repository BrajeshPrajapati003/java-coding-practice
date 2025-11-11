
import java.util.Scanner;

public class Trigonometric_ArcAngles {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the degree:");
            double deg = sc.nextDouble();

            double rad = Math.toRadians(deg);
            System.out.println("Trigonometric arc Tangent is: " + Math.atan(rad));
            System.out.println("Trigonometric arc Cosine is: " + Math.acos(rad));
            System.out.println("Trigonometric arc Sine is: " + Math.asin(rad));

            double x= -5;
            double y = 5;
            System.out.println("Trigonometric arc tangent is(-PI to PI): " + Math.atan2(x, y));

            //NOTE: atan2() detects the correct quadrant, something atan() can't do.

        }
    }
}
