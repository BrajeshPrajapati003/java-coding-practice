
import java.util.Scanner;
public class FirstAlphabetCapital {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence here: ");
        String str = sc.nextLine();
        String uprLine = "";

        // The new line which is generated after conversion.
        Scanner lineScan = new Scanner(str);
        while(lineScan.hasNext()){
            String word = lineScan.next();
            uprLine += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
        }
        System.out.println("Given Sentence is: " + str);
        System.out.println("Sentence after convert: " + uprLine.trim());
    }
}