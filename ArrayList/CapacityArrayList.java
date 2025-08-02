
import java.util.ArrayList;
public class CapacityArrayList{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(43);
        list.add(66);
        list.add(67);
        list.add(71);

        System.out.println(list.size());
        list.trimToSize();

    }
}