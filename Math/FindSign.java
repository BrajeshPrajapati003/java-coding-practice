import java.util.Scanner;

public class FindSign {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            double num = sc.nextDouble();
            double res = Math.signum(num);

            if (res == 0)
                System.out.println("It's zero");
            else if (res == 1)
                System.out.println("It's a positive number");
            else if (res == -1)
                System.out.println("It's a negative number");
            else
                System.out.println("It isn't a number");
        }
    }
}
