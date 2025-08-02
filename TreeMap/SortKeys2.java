
import java.util.Comparator;
import java.util.TreeMap;
public class SortKeys2 {
    public static void main(String[] args) {
        TreeMap<String, String> s1 = new TreeMap<>(new Sort_Keys2());
        s1.put("101", "Brajesh");
        s1.put("102", "Apple");
        s1.put("103", "Banana");
        s1.put("104", "Oranges");

        System.out.println(s1);
    }
}

class Sort_Keys2 implements Comparator<String>{
    @Override
    public int compare(String s1, String s2){
        // This is the natural comparison:
        // return s1.compareTo(s2); // {101=Brajesh, 102=Apple, 103=Banana, 104=Oranges}

        // Reverse the natural comparison:
        return s2.compareTo(s1); // {104=Oranges, 103=Banana, 102=Apple, 101=Brajesh}
    }
}
