import java.util.HashMap;

public class GetValue {
    public static void main(String[] args) {
        HashMap<String, Integer> mp = new HashMap<>();
        mp.put("a", 1);
        mp.put("b", 2);
        mp.put("a",3);
        mp.put("c", 1);

        System.out.println(mp);
        // System.out.println("Required key value: "+ mp.get("b"));
        int a = (int) mp.get("b");
        System.out.println(a);
    }
}
