import java.util.TreeMap;

public class LessThanEqualTo {
    public static void main(String[] args) {
        TreeMap<Integer, String> t = new TreeMap<>();
        t.put(101, "apple");
        t.put(102, "Mango");
        t.put(103, "strawberry");
        t.put(104, "banana");

        System.out.println("Given TreeMap: " + t);
        System.out.println("Checking the 101 key value: " + t.floorEntry(101));
        System.out.println("Checking the 105 key value: " + t.floorEntry(105));

        System.out.println("Checking the 101 key: " + t.floorKey(101));
        System.out.println("Checking the 105 key: " + t.floorKey(105));
    }
}
