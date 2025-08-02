import java.util.TreeMap;

public class LeastKey {
    public static void main(String[] args) {
        TreeMap<Integer, String> t = new TreeMap<>();
        t.put(1, "brajesh");
        t.put(2, "apple");
        t.put(3, "guava");
        t.put(4, "mango");
        t.put(5, "banana");

        System.out.println("Given TreeMap: " + t);
        System.out.println("Checking the 2 key(s): " + t.higherEntry(2));
        System.out.println("Checking the 7 key(s): " + t.higherEntry(7));
    }
}
