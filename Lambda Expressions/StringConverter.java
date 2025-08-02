import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringConverter {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Brajesh", "Kashish", "Kavita", "Vijay");

        List<String> uprString = list.stream().map(str -> str.toUpperCase()).collect(Collectors.toList());

        List<String> lwrString = list.stream().map(str -> str.toLowerCase()).collect(Collectors.toList());

        System.out.println("Uppercase string: " + uprString);
        System.out.println("Lowercase string: " + lwrString);
        
    }
}
