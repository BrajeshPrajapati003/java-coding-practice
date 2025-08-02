public class CountWords {
    public static void main(String[] args) {
        String input = "String and string function he he ek or function";
        String[] words = input.split(" ");
        int wrc = 1; // Word occurrence counter

        for(int i=0; i<words.length; i++){
            for(int j=i+1; j<words.length; j++){
                if(words[i].equals(words[j])){ // Compare words (case sensitive)
                    wrc++; // Increment counter
                    words[j] = "0"; // Mark duplicate
                }
            }

            if(!words[i].equals("0")){ // Check if word isn't marked as duplicate
                System.out.println(words[i]+" = "+wrc);
            }
            wrc = 1; // Reset counter
        }
    }
}