import java.util.HashMap;
import java.util.Map;

public class OptimizedCountWords2 {
    public static void main(String[] args) {
        String str = "Brajesh Prajapati is brajesh Prajapati";
        String[] wordsArray = str.split(" ");

        // to store word counts
        Map<String, Integer> wordCount = new HashMap<>();


        for(String word: wordsArray){
            word = word.toLowerCase(); // for case-insenstivity
            wordCount.put(word, wordCount.getOrDefault(word, 0)+1);
        }

        // print word counts
        for(Map.Entry<String, Integer> entry : wordCount.entrySet()){
            System.out.println(entry.getKey()+" = "+entry.getValue());
        }
    }
}
