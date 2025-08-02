import java.util.HashMap;
import java.util.Map;

public class makeMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "brajesh");
        map.put(2, "yogesh");
        map.put(3, "bhavana");

        for(Map.Entry x:map.entrySet()){
            System.out.println(x.getKey() + " "+ x.getValue());
        }
    }
}
