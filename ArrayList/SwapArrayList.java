import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SwapArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(43);
        list.add(66);
        list.add(67);
        list.add(71);
        System.out.println("ArrayList before swap: " + list);
        Collections.swap(list, 1,0);
        System.out.println("ArrayList after swap" + list);
    }
}
