
import java.util.List;

public class SmallestPalindromeString {
    public static void main(String[] args) {
        List<String> strings = List.of("hello", "defied", "deed", "level");
        System.out.println("given Strings: " + strings);

        // Using lambda expression to find the smallest palindrome string
        String smallestPalindrome = strings.stream()
        .filter(SmallestPalindromeString::isPalindrome) // Filter palindrome strings
        .min((str1, str2) -> Integer.compare(str1.length(), str2.length())) // Find the smallest one
        .orElse("No palindrome found"); // Handle case when there are no palindromes

        System.out.println("Smallest Palindrome String: " + smallestPalindrome);
    }

    // Helper method to check if a string is a palindrome
    public static boolean isPalindrome(String str){
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}
