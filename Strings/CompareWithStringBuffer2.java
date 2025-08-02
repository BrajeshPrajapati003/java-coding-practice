import java.util.Scanner;
public class CompareWithStringBuffer2 {
    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        System.out.println("Enter the second string: ");
        String str2 = sc.nextLine();
        sc.close();

        StringBuffer buff = new StringBuffer(str1);
        System.out.println("Comparing "+str1+" with "+str2+" : "+ str2.contentEquals(buff));

    }
}
