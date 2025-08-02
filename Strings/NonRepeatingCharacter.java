public class NonRepeatingCharacter {
    public static void main(String[] args) {
        // Input string
        String str = "brajesh prajapati";
        
        // Print the given string
        System.out.println("Given String: " + str);
        System.out.println("Non Repeated Characters in String are: ");
        
        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            boolean flag = true; // Assume current character is non-repeating
            
            // Compare current character with all other characters
            for (int j = 0; j < str.length(); j++) {
                if (i != j && str.charAt(i) == str.charAt(j)) {
                    flag = false; // Set flag to false if character is repeated
                    break; // Exit inner loop if duplicate is found
                }
            }
            
            // Print character if it is non-repeating and not a space
            if (flag && str.charAt(i) != ' ') {
                System.out.print(str.charAt(i) + " ");
            }
        }
    }
}