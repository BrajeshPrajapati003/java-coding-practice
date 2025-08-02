import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.LinkedHashSet;

public class RemoveDuplicates2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(2);
        list.add(1);
        System.out.println("Original list: " + list);

        // LinkedHashSet preserves order of insertion
        Set<Integer> set = new LinkedHashSet<>(list);
        list.clear();
        list.addAll(set);

        System.out.println("List without duplicates: " + list);
    }
}