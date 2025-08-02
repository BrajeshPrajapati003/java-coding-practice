
import java.util.Arrays;
import java.util.List;

public class Greater5Char {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Apple", "Mango", "Banana", "Orange", "date");
        System.out.println("Given strings: " + strings);
        
        // Using lambda Expression to filter out strings with length greather than 5
        List<String> filteredStrings = strings.stream().filter(str -> str.length() <= 5).collect(java.util.stream.Collectors.toList());

        // Print the filtered strings
        System.out.println("Strings with length less than or equal to 5 characters:");
        filteredStrings.forEach(System.out::println);
    }
}
