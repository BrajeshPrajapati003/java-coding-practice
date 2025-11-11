
import java.util.Scanner;

public class HyperbolicAngles {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the degree:");
            double deg = sc.nextDouble();

            double rad = Math.toRadians(deg);

            System.out.println("Hyperbolic Tangent: " + Math.tanh(rad));
            System.out.println("Hyperbolic Sine: " + Math.sinh(rad));
            System.out.println("Hyperbolic Cosine: " + Math.cosh(rad));
        }
    }
}
