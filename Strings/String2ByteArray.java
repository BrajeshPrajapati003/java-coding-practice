import java.util.Scanner;
public class String2ByteArray {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the string: ");
            String str1 = sc.nextLine();

            byte[] byteArr = str1.getBytes();
            String str2 = new String(byteArr);
            System.out.println(byteArr);
            System.out.println("The new String equals: "+str2);
        }
    }
}