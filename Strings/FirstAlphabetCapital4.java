import java.util.Locale;
import java.util.Scanner;
public class FirstAlphabetCapital4 {
    public static void main(String[] args) {
        System.out.println("Enter sentence here: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        StringBuilder uprLine = new StringBuilder();
        String[] words = str.split("\\s+");

        for(String w : words){
            if(!w.isEmpty()){
                // Get first letter as string
                String firstLetter = w.substring(0,1);
                // Use Locale
                String capitalizedLetter = firstLetter.toUpperCase(Locale.getDefault());
                uprLine.append(capitalizedLetter).append(w.substring(1)).append(" ");
            }
        }
        System.out.println();
        System.out.println("Given string is: " + str);
        System.out.println("Converted string is: " + uprLine);
        sc.close();
    }
}
