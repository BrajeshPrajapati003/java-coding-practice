
import java.util.Map;
import java.util.TreeMap;
public class CopyTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> s1 = new TreeMap<>();
        s1.put(43, "Brajesh");
        s1.put(67, "Kavita");
        s1.put(66, "Kashish");

        System.out.println("TreeMap 1: " + s1);

        TreeMap<Integer, String> s2 = new TreeMap<>();
        s2.put(70, "Khushi");
        s2.put(71, "Kirti");
        System.out.println("TreeMap 2: " + s2);

        s1.putAll(s2);
        System.out.println("After copying treemap 2 to treemap 1:");
        for(Map.Entry<Integer, String> entry : s1.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
