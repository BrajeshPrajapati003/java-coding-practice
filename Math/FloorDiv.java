import java.util.Scanner;

public class FloorDiv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = 0, n2 = 0;

        System.out.println("Enter the number 1:");
        n1 = sc.nextInt();
        System.out.println("Enter the second number:");
        n2 = sc.nextInt();

        System.out.println("Result: " + Math.floorDiv(n1, n2));
    }
}
