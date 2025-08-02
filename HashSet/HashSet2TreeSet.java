import java.util.HashSet;
import java.util.TreeSet;
public class HashSet2TreeSet {
    public static void main(String[] args) {
        HashSet <Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        System.out.println("set is: "+ set);

        TreeSet <Integer> treeset = new TreeSet<>(set);
        System.out.println("tree set is: " + treeset);
    }
}
