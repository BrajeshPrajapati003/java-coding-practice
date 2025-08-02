import java.util.ArrayList;
import java.util.List;

public class CopyArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("List 1 : " + list);

        List<Integer> list2 = new ArrayList<>(list);
        System.out.println("List 2 : " + list2);

        list2.add(66);
        list.add(43);
        System.out.println("After Insertion: ");
        System.out.println(list);
        System.out.println(list2); // Both lists are independent of each other
    }
}
