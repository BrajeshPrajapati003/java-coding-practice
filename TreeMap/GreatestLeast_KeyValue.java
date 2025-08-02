
import java.util.TreeMap;

public class GreatestLeast_KeyValue {
    public static void main(String[] args) {
        TreeMap<Integer, String> t = new TreeMap<>();
        t.put(101, "apple");
        t.put(102, "Mango");
        t.put(103, "strawberry");
        t.put(104, "banana");

        System.out.println("Given TreeMap: " + t);

        // Key value Mapping associated with greatest and the least key
        System.out.println("Greatest Key: " + t.firstEntry());
        System.out.println("Least Key: " + t.lastEntry());

        // First(lowest) and Last(highest) key
        System.out.println("Greatest Key: " + t.firstKey());
        System.out.println("Least Key: " + t.lastKey());

        // Reverse Order View of the Keys
        System.out.println("Reverse Order view of the keys: " + t.descendingKeySet());

        // Key value mapping associated with the Greatest key <= Given key
        System.out.println("Checking the 101 key value: " + t.floorEntry(101));
        System.out.println("Checking the 105 key value: " + t.floorEntry(105));

        // Greatest key <= Given key
        System.out.println("Checking the 101 key: " + t.floorKey(101));
        System.out.println("Checking the 105 key: " + t.floorKey(105));
    }
}
