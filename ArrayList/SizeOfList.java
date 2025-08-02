import java.util.ArrayList;

public class SizeOfList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(43);
        list.add(66);
        list.add(67);
        list.add(71);
        list.add(34);

        System.out.println("The number of elements in the list: " + list.size());
    }
}
