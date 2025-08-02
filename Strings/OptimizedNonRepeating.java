import java.util.HashMap;
import java.util.Map;
public class OptimizedNonRepeating {
    public static void main(String[] args) {
        String str = "brajesh prajapati";
        System.out.println("Given String: "+str);
        System.out.println("Non Repeating characteres are:");
        
        // Create a hashmap to store frequency of characters
        HashMap<Character, Integer> map = new HashMap<>();

        // Populate the hashmap with character counts
        for(char c: str.toCharArray()){
            map.put(c, map.getOrDefault(c,0) + 1);
        }

        // Print characters that appear only once
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                System.out.print(entry.getKey()+" ");
            }
        }
    }
}