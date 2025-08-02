import java.util.HashMap;
import java.util.Map;
public class copyMappingsToOtherHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> mp = new HashMap<>();
        mp.put("a", 1);
        mp.put("b", 2);
        mp.put("a",3);
        mp.put("c", 1);
        // System.out.println(mp);

        // HashMap doesn't store duplicate keys but different keys can have same values.

        HashMap<String, Integer> map2 = new HashMap<>(mp);
        // System.out.println(map2);

        for(Map.Entry x: map2.entrySet()){
            System.out.println(x.getKey()+" = "+x.getValue());
        }
    }
}
