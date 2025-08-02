import java.util.ArrayList;
import java.util.List;

public class Join2Arrays {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(43);
        list1.add(66);
        list1.add(67);
        list1.add(71);
        System.out.println("List 1 : " + list1);

        List<Integer> list2 = new ArrayList<>();
        list2.add(43);
        list2.add(32);
        list2.add(34);
        list2.add(27);
        System.out.println("List 2 : " + list2);

        List<Integer> list3 = new ArrayList<>();
        list3.addAll(list1);
        list3.addAll(list2);
        System.out.println("List 3 : " + list3);
    }
}
