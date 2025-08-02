import java.io.UnsupportedEncodingException;
import java.util.Scanner;
public class String2ByteArray2 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the string:");
            String s1 = sc.nextLine();

            byte[] byteArray = s1.getBytes();
            String s2 = new String(byteArray); // to get the output in human readable format (string)
            System.out.println("Displaying the bytearray: " +s2); 
        }
    }
}
