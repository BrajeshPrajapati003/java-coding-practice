import java.util.HashMap;
import java.util.Set;

public class KeySetView {
    public static void main(String[] args) {
        HashMap<String, Integer> mp = new HashMap<>();
        mp.put("a", 1);
        mp.put("b", 2);
        mp.put("a",3);
        mp.put("c", 1);

        System.out.println("map is: "+mp);
        Set setView = mp.entrySet();
        Set keySetView = mp.keySet();
        System.out.println("Set view: "+setView);
        System.out.println("Key set view: "+keySetView);
    }
}
