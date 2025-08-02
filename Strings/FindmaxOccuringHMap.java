import java.util.HashMap;
import java.util.Map;
public class FindmaxOccuringHMap {
    public static void main(String[] args) {
        String str = "brajesh prajapati";
        int max = -1;
        char res = ' ';
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            map.put(c , map.getOrDefault(c, 0) + 1);
        }

        for(Map.Entry<Character, Integer> entry: map.entrySet()){
            if(max < entry.getValue()){
                max = entry.getValue();
                res = entry.getKey();
            }
        }

        System.out.println("The most occuring character is: " + res);
    }
}