import java.util.Scanner;
public class Concatenate2Strings {
    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        System.out.println("Enter the second string: ");
        String str2 = sc.nextLine();
        sc.close();

        System.out.println(str1+" "+str2);
    }
}
