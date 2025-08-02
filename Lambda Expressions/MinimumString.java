
import java.util.ArrayList;
import java.util.List;

public class MinimumString {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> strings = new ArrayList<>();
        strings.add("Apple");
        strings.add("Banana");
        strings.add("Orange");
        strings.add("Grapes");

        // Find the minimum string using a lambda expression
        String minString = strings.stream().min((str1, str2) -> Integer.compare(str1.length(), str2.length())).orElse(null);

        System.out.println("Given strings: " + strings);
        System.out.println("Minimum String: " + minString);

    }
}
