import java.util.Scanner;
public class PolygonArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of sides:");
        int n = sc.nextInt();
        System.out.println("Enter the side:");
        double side = sc.nextDouble();
        double area = (n*side*side)/(4*Math.tan(Math.PI/n));
        System.out.println("Area of the Pentagon: " + area);
        sc.close();
    }
}
