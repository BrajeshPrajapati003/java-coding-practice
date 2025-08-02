import java.util.Scanner;
public class CheckSameDataStrings {
    public static void main(String[] args) {
        try( Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the first string: ");
            String s1 = sc.nextLine();
            System.out.println("Enter the second string: ");
            String s2 = sc.nextLine();
            System.out.println("Are the both strings equal: "+s1.equals(s2));

        }
    }
}
