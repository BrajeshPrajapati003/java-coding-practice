import java.util.ArrayList;
import java.util.List;
public class MaximumString {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> strings = new ArrayList<>();
        strings.add("Apple");
        strings.add("Banana");
        strings.add("Orange");
        strings.add("Grapes");

        // Find the maximum string using a lambda expression
        String maxString = strings.stream().max((str1, str2) -> Integer.compare(str1.length(), str2.length())).orElse(null);

        // Print the list of strings and the maximum string
        System.out.println("List of strings: " + strings);
        System.out.println("Maximum string: " + maxString);
    }
}
