import java.util.ArrayList;
import java.util.List;

public class InsertElement_MoreThanOne {
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

        List<Integer> list2 = new ArrayList<>();
        list2.add(67);
        list2.add(66);
        list2.add(43);

        list.addAll(0, list2);
        System.out.println(list);
    }
}
