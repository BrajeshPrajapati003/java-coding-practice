
import java.util.List;
public class LongestPalindrome {
    public static void main(String[] args) {
        List<String> list = List.of("brajesh", "naman", "gig", "date", "racecar", "defied");
        System.out.println("Given Strings: " + list);
        String longestPalindrome = list.stream().filter(s -> s.equalsIgnoreCase(new StringBuilder(s).reverse().toString())).max((s1, s2) -> s1.length() - s2.length()).orElse("No palindrome found");
        System.out.println("Longest palindrome string: " + longestPalindrome);
    }
}
