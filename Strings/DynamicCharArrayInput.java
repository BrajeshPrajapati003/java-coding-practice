import java.util.ArrayList;
import java.util.Scanner;

public class DynamicCharArrayInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter characters (one at a time, press Enter after each, or type 'done' to finish): ");

        ArrayList<Character> charList = new ArrayList<>();

        while (scanner.hasNext()) {
            String input = scanner.next();
            if (input.equalsIgnoreCase("done")) { // Check for "done" (case-insensitive)
                break; // Exit loop if "done" is entered
            } else if (input.length() > 0) { // Check for empty input
                charList.add(input.charAt(0)); // Add the character
            }
        }

        char[] charArray = new char[charList.size()];
        for (int i = 0; i < charList.size(); i++) {
            charArray[i] = charList.get(i);
        }

        System.out.println("Character array: ");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.println();
        scanner.close();
    }
}