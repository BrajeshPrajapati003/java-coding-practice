import java.util.ArrayList;
import java.util.List;

public class InsertAt {
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
        
        list.add(1,43);
        list.add(2, 66);
        System.out.println("New list: " + list);
    }
}
