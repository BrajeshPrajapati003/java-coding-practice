import java.util.TreeMap;

public class GetPortion {
    public static void main(String[] args) {
        TreeMap<Integer, String> t = new TreeMap<>();
        t.put(1, "brajesh");
        t.put(2, "apple");
        t.put(3, "guava");
        t.put(4, "mango");
        t.put(5, "banana");

        System.out.println("Given TreeMap: " + t);
        System.out.println("checking the 1 key(s): " + t.headMap(1));
        System.out.println("checking the 3 key(s): " + t.headMap(3));
        System.out.println("checking the 7 key(s): " + t.headMap(7));

        System.out.println();
        // Get the portion of this map whose keys < (or = if inclusive is true) a given key
        System.out.println("Checking the 1 key(s): " + t.headMap(1, true));
        System.out.println("checking the 3 key(s): " + t.headMap(3, true));
        System.out.println("Checking the 7 key(s): " + t.headMap(7, true));
    }
}
