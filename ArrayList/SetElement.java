import java.util.ArrayList;
import java.util.List;

public class SetElement {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        list.set(0, 43);
        list.set(1, 66);
        System.out.println(list);
    }
}
