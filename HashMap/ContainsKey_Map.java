import java.util.HashMap;

public class ContainsKey_Map {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"bat");
        map.put(2, "bowl");
        map.put(3, "apple");
        map.put(4, "owl");
        map.put(5, "happy");

        // if(map.containsKey(0)) System.out.println("Present...");
        // else System.out.println("Not present...");

        if(map.containsValue("rice")) System.out.println("Present...");
        else System.out.println("Not present...");
    }
}
