import java.util.HashMap;

public class DoesMapContainValue {
    public static void main(String[] args) {
        HashMap<String, Integer> mp = new HashMap<>();
        mp.put("a", 1);
        mp.put("b", 2);
        mp.put("a",3);
        mp.put("c", 1);

        if(mp.containsValue(2)) System.out.println("yes! It's key is: "+ mp.get(2));
    }
}
