import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingChar {
    public static Character findFirstNonRepeating(String str){
        if(str == null || str.isEmpty()) return null;

        // Count the frequency of each character
        Map<Character, Integer> charCount = new HashMap<>();
        for(char c: str.toCharArray()){
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Find the first character with a frequency of 1
        for(char c: str.toCharArray()){
            if(charCount.get(c) == 1) return c;
        }

        return null; // No non-repeating character found
    }
    public static void main(String[] args) {
        String s1 = "abacabad";
        String s2 = "aabcc";
        System.out.println("First non-repeating char in \"" + s1 + "\": " + findFirstNonRepeating(s1));
        System.out.println("First non-repeating char in \"" + s2 + "\": " + findFirstNonRepeating(s2));
    }
}
