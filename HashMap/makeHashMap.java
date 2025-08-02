import java.util.HashMap;
import java.util.Map;

public class makeHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hMap = new HashMap<String, Integer>();
        hMap.put("Brajesh", 101);
        hMap.put("Yogesh", 102);
        hMap.put("Bhavana", 103);
        hMap.put("Kashish", 104);
        hMap.put("Shaktimaan", 105);

        System.out.println(hMap);

        for(Map.Entry x: hMap.entrySet()){
            System.out.println(x.getKey() + " " + x.getValue());
        }

    }
}
