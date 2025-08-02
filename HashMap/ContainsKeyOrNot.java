import java.util.HashMap;
import java.util.Set;
public class ContainsKeyOrNot {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"bat");
        map.put(2, "bowl");
        map.put(3, "apple");
        boolean isPresent = checkKey(map);
        if(isPresent)System.out.println("present!");
        else System.out.println("Not present!");
    }
    
    public static boolean checkKey(HashMap<Integer, String> map){
        Set <Integer> keys = map.keySet();
        for(Integer key : keys){
            if(key == 1) return true;
            else continue;
        }
        return false;
    }
}
