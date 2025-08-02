import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class CopyArrayList2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("List 1: " + list);

        // List<String> list2 = new ArrayList<>();
        // list2.add("A");
        // list2.add("B");
        // list2.add("C");
        // list2.add("D");
        // list2.add("E");
        // System.out.println("List 2: " + list2);

        // Different List types don't work on collections.copy()
        
        List<Integer> list2 = new ArrayList<>();
        list2.add(6);
        list2.add(7);
        list2.add(8);
        // list2.add(9);
        // list2.add(0);
        System.out.println("List 2: " + list2);

        Collections.copy(list,list2); // List type should be same
        System.out.println("After copying the content of list2 into list1");
        System.out.println("List 1: " + list);
        System.out.println("List 2: " + list2);
        
    }
}