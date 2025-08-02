import java.util.HashMap;
import java.util.Set;
public class Map2Set {
    public static void main(String[] args) {
        HashMap<String, Integer> mp = new HashMap<>();
        mp.put("a", 1);
        mp.put("b", 2);
        mp.put("a",3);
        mp.put("c", 1);

        System.out.println("Map is: "+ mp);

        Set set = mp.entrySet();
        System.out.println("Set is: "+ set);
    }
}
