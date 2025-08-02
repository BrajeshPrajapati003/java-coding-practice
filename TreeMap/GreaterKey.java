import java.util.TreeMap;

public class GreaterKey {
    public static void main(String[] args) {
        TreeMap<Integer, String> t = new TreeMap<>();
        t.put(1, "brajesh");
        t.put(2, "apple");
        t.put(3, "guava");
        t.put(4, "mango");
        t.put(5, "banana");

        System.out.println("Given TreeMap: " + t);

        // Portion of map whose keys > given key
        System.out.println("Keys greater than 2: " + t.tailMap(2, false));

        // Portion of a map whose keys >= given key
        System.out.println("keys greater <= 3: " + t.tailMap(3));
    }
}
