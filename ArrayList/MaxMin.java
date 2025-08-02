import java.util.ArrayList;
import java.util.Collections;
public class MaxMin {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(43);
        list.add(66);
        list.add(67);
        list.add(71);
        list.add(34);

        System.out.println("maximum element is: " + Collections.max(list));
        System.out.println("Minimum element is: " + Collections.min(list));
    }
}