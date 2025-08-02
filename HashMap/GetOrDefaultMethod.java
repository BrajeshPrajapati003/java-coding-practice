import java.util.HashMap;
public class GetOrDefaultMethod{
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // Insert key-value pairs
        map.put("apple",10);
        map.put("banana", 20);
        map.put("orange",30);
        
        // Overwrite an existing value
        map.put("orange", 25);
        int orangeCount = map.getOrDefault("orange",0);
        System.out.println("Orange Count: "+orangeCount); // 25

        // Get the value for "apple"
        int appleCount = map.getOrDefault("apple",0);
        System.out.println("Apple Count: "+appleCount); // 10

        // Get the value for "Mausambi" (which doesn't exist)
        int mausambiCount = map.getOrDefault("Mausambi", 0);
        System.out.println("Mausambi Count: "+mausambiCount); // 0

        
    }
}


