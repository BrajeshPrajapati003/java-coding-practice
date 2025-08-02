import java.util.Map;
import java.util.TreeMap;
public class SpecifiedKeyValue{
    public static void main(String[] args) {
        TreeMap<Integer, String> stu = new TreeMap<>();
        stu.put(10, "John");
        stu.put(43, "Brajesh");
        stu.put(66, "Kashish");

        for(Map.Entry<Integer, String> entry: stu.entrySet()){
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }
    }
}