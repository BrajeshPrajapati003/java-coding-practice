import java.util.List;
import java.util.stream.Collectors;
public class ConvertCaseBasedOnLength {
    public static void main(String[] args) {
        List<String> fruits = List.of("Apple", "Banana", "Raspberries", "Orange");
        System.out.println("Original Strins: " + fruits);
        List<String> modifiedStrings = fruits.stream().map(s -> (s.length() % 2 == 0) ? s.toUpperCase() : s.toLowerCase()).collect(Collectors.toList());
        System.out.println("Modified Strings: " + modifiedStrings);
    }
}
