import java.util.HashMap;
public class HashMap_ShallowCopy {
    public static void main(String[] args) {
        HashMap<String, Integer> mp = new HashMap<>();
        mp.put("a", 1);
        mp.put("b", 2);
        mp.put("a",3);
        mp.put("c", 1);

        System.out.println("The original map: " + mp);
        HashMap<String, Integer> map = new HashMap<>();
        map = (HashMap) mp.clone();
        System.out.println("The shallow copy: " + map);
    }
}