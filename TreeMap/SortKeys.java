import java.util.Comparator;
import java.util.TreeMap;

public class SortKeys {
    public static void main(String[] args) {
        TreeMap<Integer, String> m1 = new TreeMap<>(new SortKey());
        m1.put(01, "Apple");
        m1.put(02, "Banana");
        m1.put(04, "Orange");
        m1.put(05, "Mausambi");
        m1.put(03, "Strawberry");
        System.out.println("TreeMap: " + m1);
    }
}

// ! This is the natural Integer comparison, so this comparator is redundant, but demonstrates how to pass in a comparator !

class SortKey implements Comparator<Integer>{
    @Override
    public int compare(Integer str1, Integer str2){
        return str1.compareTo(str2);
    }
}