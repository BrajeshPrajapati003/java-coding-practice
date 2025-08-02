
import java.util.ArrayList;
import java.util.List;

public class WordsStartingWithVowel {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("date");

        System.out.println("Given words:  " + fruits);
        long count = fruits.stream().filter(s -> s.matches("(?i)[aeiou].*")).count();

        System.out.println("Number of wordss starting with a vowel: " + count);
    }
}
