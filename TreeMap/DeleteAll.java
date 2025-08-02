import java.util.TreeMap;

public class DeleteAll {
    public static void main(String[] args) {
        TreeMap<Integer, String> m1 = new TreeMap<>();
        m1.put(01, "Apple");
        m1.put(02, "Banana");
        m1.put(03, "Strawberry");
        m1.put(04, "Orange");
        m1.put(05, "Mausambi");

        System.out.println("TreeMap: " + m1);

        m1.clear();
        System.out.println("New TreeMap: " + m1);
    }
}
