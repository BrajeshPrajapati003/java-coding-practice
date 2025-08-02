import java.util.*;

public class DoesMapContainKey {
    public static void main(String[] args) {
        HashMap<String, Integer> mp = new HashMap<>();
        mp.put("a", 1);
        mp.put("b", 2);
        mp.put("a",3);
        mp.put("c", 1);

        if(mp.containsKey("a")) System.out.println("yes " + mp.get("a"));
        else System.out.println("no");
    }
}
