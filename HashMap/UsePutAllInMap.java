import java.util.HashMap;
public class UsePutAllInMap {
    public static void main(String[] args) {
        HashMap<String, Integer> mp = new HashMap<>();
        mp.put("a", 1);
        mp.put("b", 2);
        mp.put("a",3);
        mp.put("c", 1);

        HashMap<String, Integer> map = new HashMap<>();
        map.putAll(mp);

        System.out.println("The first HashMap: "+ mp);
        System.out.println("The second HashMap: "+map);
    }
}
