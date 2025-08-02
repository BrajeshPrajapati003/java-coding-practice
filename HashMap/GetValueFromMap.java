import java.util.HashMap;
public class GetValueFromMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"bat");
        map.put(2, "bowl");
        map.put(3, "apple");

        for(int i=0; i<=5; i++){
            System.out.println("Value mapped to "+i+ " = " + map.get(i));
        }
    }
}
