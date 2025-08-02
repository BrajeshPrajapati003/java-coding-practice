import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class ShuffleArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(43);
        list.add(66);
        list.add(67);
        list.add(71);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
    }
}
