
import java.util.HashMap;
import java.util.Map;

public class AnagramCheck {
    public static boolean areAnagrams(String s1, String s2){
        if(s1.length() != s2.length()) return false;

        // Method 1: Using character count (HashMap)
        Map<Character, Integer> charCount = new HashMap<>();
        for(char c: s1.toCharArray()){
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        for(char c: s2.toCharArray()){
            if(charCount.containsKey(c)){
                charCount.put(c, charCount.get(c) - 1);
                if(charCount.get(c) == 0){
                    charCount.remove(c);
                }
            }else{
                return false; // Character not found in s1
            }
        }

        // If the map is empty, all characters matched
        return charCount.isEmpty();


        // Method 2: Using sorting(alternative)
        // char[] arr1 = s1.toCharArray();
        // char[] arr2 = s2.toCharArray();

        // Arrays.sort(arr1);
        // Arrays.sort(arr2);

        // return Arrays.equals(arr1, arr2);
    }
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        System.out.println(s1 + " and " + s2 + ": " + areAnagrams(s1, s2));
    }
}
