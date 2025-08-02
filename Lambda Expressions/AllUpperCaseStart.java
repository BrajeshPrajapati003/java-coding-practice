
import java.util.List;

public class AllUpperCaseStart {
    public static void main(String[] args) {
        List<String> list = List.of("Brajesh", "Kashish", "Banana");
        System.out.println("Given Strings: " + list);
        boolean upperCaseStart = list.stream().allMatch(s -> Character.isUpperCase(s.charAt(0)));
        System.out.println("All start with UpperCase: " + upperCaseStart);
    }
}
