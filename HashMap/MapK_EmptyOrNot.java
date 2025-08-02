import java.util.HashMap;

public class MapK_EmptyOrNot {
    public static void main(String[] args) {
        HashMap<String, Integer> mp = new HashMap<>();
        mp.put("a", 1);
        mp.put("b", 2);
        mp.put("a",3);
        mp.put("c", 1);

        System.out.println("Is hashmap empty: "+ mp.isEmpty());
        mp.clear();

        System.out.println("After using clear method!!");
        System.out.println("Is hashmap empty: "+ mp.isEmpty());
        
    }
}
