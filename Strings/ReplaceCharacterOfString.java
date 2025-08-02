import java.util.Scanner;
public class ReplaceCharacterOfString {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the string: ");
            String s = sc.nextLine();
            String str = s.replace('a', 'b');
            System.out.println(str);
        }
    }
}