import java.util.Scanner;
public class String2CharArray {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the string: ");
            String s = sc.nextLine();

            char[] arr = s.toCharArray();
            System.out.println("Character array: " + new String(arr));

            // converting into lowercase
            System.out.println(s.toLowerCase());

            // converting into uppercase
            System.out.println(s.toUpperCase());

            // get the length of the string
            System.out.println(s.length());
        }
    }
}
