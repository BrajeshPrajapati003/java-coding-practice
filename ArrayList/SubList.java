import java.util.ArrayList;
import java.util.List;

public class SubList {
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("List 1: " + list);

        List<Integer> sublist = list.subList(0, 3);
        sublist.set(2,66); // Updating the original list
        System.out.println("Sublist: " + sublist);
        System.out.println("List 1: " + list); // Original list got changed
    }
}