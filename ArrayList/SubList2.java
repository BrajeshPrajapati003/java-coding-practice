import java.util.ArrayList;
import java.util.List;

public class SubList2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("Original list: " + list);

        List<Integer> sublist = list.subList(1,4);
        System.out.println("Displaying elements of the sublist...");
        for(int i=0; i<sublist.size(); i++){
            System.out.println(sublist.get(i)+" ");
        }

        // Removing one element from the sublist
        sublist.remove(2);
        
        System.out.println("After removing from sublist ArrayList contains...");
        for(int i=0; i<list.size(); i++){
            System.out.printf(list.get(i) + " ");
        }
    }
}
