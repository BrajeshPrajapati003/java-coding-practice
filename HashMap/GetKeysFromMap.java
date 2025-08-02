import java.util.HashMap;
import java.util.Set;

public class GetKeysFromMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"bat");
        map.put(2, "bowl");
        map.put(3, "apple");

        System.out.println("Print all the keys:");
        Set<Integer> keys = map.keySet();
        for(Integer k: keys){
            System.out.print(k+" ");
        }

        System.out.println();

        System.out.println("Print all the values:");
        for(Integer v: map.keySet()){
            System.out.print(map.get(v)+ " ");
        }
    }
}
