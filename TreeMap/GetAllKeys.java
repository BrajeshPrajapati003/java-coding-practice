
import java.util.Set;
import java.util.TreeMap;

public class GetAllKeys {
    public static void main(String[] args) {
        TreeMap<Integer, String> m1 = new TreeMap<>();
        m1.put(01, "Apple");
        m1.put(02, "Banana");
        m1.put(03, "Strawberry");
        m1.put(04, "Orange");
        m1.put(05, "Mausambi");

        System.out.println("TreeMap: " + m1);
        Set<Integer> keys = m1.keySet();
        for(Integer key: keys){
            System.out.print(key + " ");
        }
    }
}
