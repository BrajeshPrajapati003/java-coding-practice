
import java.util.List;

public class FirstNonEmptyString {
    public static void main(String[] args) {
        List<String> list = List.of("", "", "", "Brajesh", "", "Kashish");
        System.out.println("Given strings: "+ list);
        String firstString = list.stream().filter(s -> !s.isEmpty()).findFirst().orElse("No non-empty String found");
        System.out.println("First non-empty string: " + firstString);
    }
}
