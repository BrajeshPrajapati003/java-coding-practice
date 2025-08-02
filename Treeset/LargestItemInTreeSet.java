import java.util.TreeSet;

public class LargestItemInTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> num = new TreeSet<>();
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        num.add(50);

        int large = num.last();
        System.out.println("Largest Element: " + large);
        System.out.println("TreeSet: " + num);
    }
}
