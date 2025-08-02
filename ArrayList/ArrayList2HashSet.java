import java.util.ArrayList;
import java.util.HashSet;
public class ArrayList2HashSet {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(43);
        list.add(66);
        list.add(67);
        list.add(71);
        list.add(34);
        System.out.println("ArrayList: " + list);

        HashSet<Integer> set = new HashSet<>(list);
        System.out.println("HashSet: " + set);
    }
}
