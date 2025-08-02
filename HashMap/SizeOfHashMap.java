import java.util.HashMap;
public class SizeOfHashMap{
    public static void main(String[] args) {
        HashMap<Integer, String> hMap = new HashMap<>();
        hMap.put(1, "a");
        hMap.put(2, "b");
        hMap.put(3, "c");

        System.out.println("number of mappings: " + hMap.size());
    }
}