import java.util.SortedMap;
import java.util.TreeMap;

public class KeysRange {
    public static void main(String[] args) {
        TreeMap<Integer, String> t = new TreeMap<>();
        t.put(1, "brajesh");
        t.put(2, "apple");
        t.put(3, "guava");
        t.put(4, "mango");
        t.put(5, "banana");
        System.out.println("given TreeMap: " + t);

        SortedMap<Integer, String> t2 = t.subMap(1, true, 3, true); // 3 is inclusive
        System.out.println("Sub TreeMap key values: " + t2);

        SortedMap<Integer, String> t3 = t.subMap(2, 5); // 5 is exclusive
        System.out.println("Sub TreeMap key values: " + t3);

    }
}
