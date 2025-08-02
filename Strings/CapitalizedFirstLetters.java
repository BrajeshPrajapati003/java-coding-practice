import java.util.Scanner;
public class CapitalizedFirstLetters {

    public static String capitalize(String str){
        // Handle null or empty input
        if(str == null || str.isEmpty()) return str;

        StringBuilder result = new StringBuilder();
        // Flag to track if the next character should be capitalized
        boolean capitalizeNext = true;

        for(char c : str.toCharArray()){
            if(Character.isWhitespace(c)){
                // capitalize after whitespace
                capitalizeNext = true;
                result.append(c);
            }else if(capitalizeNext){
                result.append(Character.toUpperCase(c));
                // Reset the flag
                capitalizeNext = false;
            }else{
                // Optionally lowercase other letters
                result.append(Character.toLowerCase(c));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inputString = sc.nextLine();

        String capitalizedString = capitalize(inputString);
        System.out.println("Capitalized String: " + capitalizedString);

        sc.close();
    }
}
