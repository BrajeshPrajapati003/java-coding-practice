import java.util.ArrayList;
import java.util.List;

public class Compare2ArrayLists {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(43);
        list1.add(66);
        list1.add(67);
        list1.add(71);
        System.out.println("List 1 : " + list1);

        List<Integer> list2 = new ArrayList<>();
        list2.add(43);
        list2.add(66);
        list2.add(67);
        list2.add(70);
        list2.add(71);
        System.out.println("List 2 : " + list2);

        List<String> list3 = new ArrayList<>();
        for(Integer i: list1) list3.add(list2.contains(i) ? "True" : "False");
        System.out.println(list3);
    }
}
