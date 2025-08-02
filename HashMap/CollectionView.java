import java.util.HashMap;
import java.util.Set;
import java.util.Collection;
public class CollectionView {
    public static void main(String[] args) {
        HashMap<String, Integer> mp = new HashMap<>();
        mp.put("a", 1);
        mp.put("b", 2);
        mp.put("a",3);
        mp.put("c", 1);

        System.out.println("map is: "+mp);
        Set setView = mp.entrySet();
        Set keySetView = mp.keySet();
        Collection collectionView = mp.values();

        System.out.println("Collection view: "+collectionView);
        System.out.println("Set view: "+setView);
        System.out.println("Key set view: "+keySetView);
    }
}
