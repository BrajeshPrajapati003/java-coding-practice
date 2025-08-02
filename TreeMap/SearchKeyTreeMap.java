
import java.util.TreeMap;

public class SearchKeyTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> s1 = new TreeMap<>();
        s1.put(43, "Brajesh");
        s1.put(67, "Kavita");
        s1.put(66, "Kashish");

        System.out.println("TreeMap 1: " + s1);
        if(s1.containsKey(43)){
            System.out.println("TreeMap contains key 43");
        }else{
            System.out.println("TreeMap doesn't contain key 43");
        }

    }
}
