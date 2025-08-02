import java.util.Scanner;
public class CheckEndsWith2 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the first string: ");
            String s1 = sc.nextLine();
            System.out.println("Enter the second string: ");
            String s2 = sc.nextLine();

            System.out.println("Enter the string to check the ending of the two given strings: ");
            String check = sc.nextLine();

            System.out.println(s1 +" compare with "+ check+" ?: "+s1.endsWith(check));
            System.out.println(s2 +" compare with "+check+" ?: "+ s2.endsWith(check));

        }

    }
}
