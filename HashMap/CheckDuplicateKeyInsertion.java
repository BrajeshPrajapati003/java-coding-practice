import java.util.HashMap;
import java.util.Map;
public class CheckDuplicateKeyInsertion {
    public static void main(String[] args) {
        HashMap<String, Integer> mp = new HashMap<>();
        mp.put("a", 1);
        mp.put("b", 2);
        mp.put("a",3); // adding element with duplicate key
        mp.put("c", 1);

        // for(Map.Entry e: mp.entrySet()){
        //     System.out.println("Key: "+ e.getKey());
        //     System.out.println("Value: "+e.getValue());
        // }

        mp.remove("c");
        System.out.println(mp);

        mp.replace("b", 234);
        System.out.println(mp);
    }
}
