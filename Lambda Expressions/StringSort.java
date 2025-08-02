
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringSort {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(List.of("Brajesh", "Kashish", "Kavita", "Priya", "Kanak"));
        System.out.println("Given String: " + strings);
        Collections.sort(strings, (s1, s2) -> s1.length() - s2.length());
        System.out.println("Ascending Order: " + strings);
    }
}
