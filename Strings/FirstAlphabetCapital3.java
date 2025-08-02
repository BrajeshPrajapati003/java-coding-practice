import java.util.Scanner;
public class FirstAlphabetCapital3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence here: ");
        String str = sc.nextLine();
        String uprLine = "";

        // Split the string into words using spaces as delimiters
        // \\s+ handles multiple spaces
        String[] words = str.split("\\s+");

        for(String word : words){
            // Handle potential empty words (e.ge. from extra spaces)
            if(!word.isEmpty()){
                uprLine += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
            }
        }
        System.out.println();

        System.out.println("Given sentence is: " + str);
        System.out.println("Sentence after convert is: " + uprLine.trim());
        sc.close(); // Close the scanner
    }
}