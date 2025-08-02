import java.util.List;

public class StringStartWithS{
    public static void main(String[] args) {
        List<String> strings = List.of("sugar Apple", "Strawberry", "salmonberry");
        System.out.println("Given strings: " + strings);

        boolean startWithS = strings.stream().allMatch(s -> s.startsWith("s") || s.startsWith("S"));
        
        if(startWithS) System.out.println("All strings start with 's' or 'S'.");
        else System.out.println("Not all strings start with 's' or 'S'.");
    }
}