import java.util.HashMap;
import java.util.Set;
public class CreateSetView {
    public static void main(String[] args) {
        HashMap<String, Integer> mp = new HashMap<>();
        mp.put("a", 1);
        mp.put("b", 2);
        mp.put("a",3);
        mp.put("c", 1);

        Set set = mp.entrySet();

        System.out.println("map values: "+ mp);
        System.out.println("Set values: "+ set);
    }
}
