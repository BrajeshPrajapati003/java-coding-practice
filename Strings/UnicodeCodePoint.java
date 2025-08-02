import java.util.Scanner;
public class UnicodeCodePoint{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        System.out.println("Enter the index to find the unicode: ");
        int index = sc.nextInt();
        sc.close();
        int ch = s.codePointAt(index);
        System.out.println("The unicode point at index "+index+" : " +ch);
    }
}