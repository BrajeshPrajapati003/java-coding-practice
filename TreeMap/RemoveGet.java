import java.util.TreeMap;

public class RemoveGet {
    public static void main(String[] args) {
        TreeMap<Integer, String> t = new TreeMap<>();
        t.put(1, "brajesh");
        t.put(2, "apple");
        t.put(3, "guava");
        t.put(4, "mango");
        t.put(5, "banana");

        System.out.println("Value Before poll: " + t);
        System.out.println("Value Returned: " + t.pollFirstEntry());
        System.out.println("Value Returned: " + t.pollLastEntry());
        System.out.println("Value after poll: " + t);
    }
}
