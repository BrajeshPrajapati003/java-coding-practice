import java.util.Scanner;
import java.util.StringTokenizer; // Legacy class
public class CountTokens {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the string: ");
            String str = sc.nextLine();

            // String.split() is recommended instead of StringTokenizer
            StringTokenizer st = new StringTokenizer(str, " ");

            // search for token while the string ends.
            while(st.hasMoreTokens()){
                System.out.println("Remaining are: " + st.countTokens());
                System.out.println(st.nextToken());
            }
        }
    }
}









