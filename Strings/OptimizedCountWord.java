import java.util.HashMap;
import java.util.Map;
public class OptimizedCountWord {
    public static void main(String[] args) {
        String str = "Brajesh Prajapati is a wizard jai ho brajesh Prajapati";
        String[] words = str.split(" ");
        
        // Create a HashMap to store and word counts
        HashMap<String, Integer> wordCount = new HashMap<>();

        // Count occurrences of each word
        for(String w: words){
            w = w.toLowerCase(); // Convert to lowercase for case-insensitive comparison
            wordCount.put(w, wordCount.getOrDefault(w, 0) + 1);
        }

        // Print word counts
        for(Map.Entry<String, Integer> entry: wordCount.entrySet()){
            System.out.println(entry.getKey()+" = "+entry.getValue());
        }
    }
}
