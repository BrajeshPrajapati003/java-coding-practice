import java.util.Scanner;
public class FirstAlphabet_Capital2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence here: ");
        String str = sc.nextLine();
        String uprLine = "";
        Scanner wordScan = new Scanner(str);

        while(wordScan.hasNext()){
            String word = wordScan.next();
            uprLine += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
        }
        System.out.println("New String is: " + uprLine);
    }
}
