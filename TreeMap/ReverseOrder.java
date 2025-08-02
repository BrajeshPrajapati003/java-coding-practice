import java.util.TreeMap;

public class ReverseOrder {
    public static void main(String[] args) {
        TreeMap<Integer, String> t = new TreeMap<>();
        t.put(101, "apple");
        t.put(102, "Mango");
        t.put(103, "strawberry");
        t.put(104, "banana");

        System.out.println("Given TreeMap: " + t);
        System.out.println("Reverse Order view of the keys: " + t.descendingKeySet());
    }
}
