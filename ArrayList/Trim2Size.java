import java.util.ArrayList;

public class Trim2Size {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.ensureCapacity(20);
        list.add(43);
        list.add(66);
        list.add(67);
        list.add(71);
        list.add(34);
        System.out.println("Before reducing size of the ArrayList: " + list.size());

        list.trimToSize();

        System.out.println("After reducing size of the ArrayList: " + list.size());

        /*
         * The capacity of the list has been reduced from 20 to the size of the list (in this case 5).
         * The number of the list (size) remains unchanged
         */
    }
}
