import java.util.Scanner;
public class CheckEndsWith{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter first string: ");
            String s1 = sc.nextLine();
            System.out.println("Enter second string: ");
            String s2 = sc.nextLine();

            String e = "sh";
            boolean ends1 = s1.endsWith(e);
            boolean ends2 = s2.endsWith(e);

            System.out.println(s1+" ends with "+ e+ " ?: "+ ends1);
            System.out.println(s2+" ends with "+ e + " ?:" + ends2);
        }
    }
}