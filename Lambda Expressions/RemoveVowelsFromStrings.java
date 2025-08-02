
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveVowelsFromStrings {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Brajesh", "Kashish", "Kavita", "Vijay");
        System.out.println("Given Strings: " + list);

        List<String> withoutVowels = list.stream().map(s -> s.replaceAll("[AEIOUaeiou]", "")).collect(Collectors.toList());
        System.out.println("Strings without vowels: " + withoutVowels);
    }
}
