
import java.util.TreeSet;

public class RemoveLargestFromTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> num = new TreeSet<>();
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        num.add(50);

        System.out.println("TreeSet Element: " + num);

        int largestItem = num.pollLast(); // removes the element
        System.out.println("Removed Item: " + largestItem);
        System.out.println("TreeSet Element: " + num);

        int large = num.last(); // don't remove the element
        System.out.println("Largest Element: " + large);
        System.out.println("TreeSet: " + num);

        int smallestItem = num.first(); // don't remove the element
        System.out.println("Smallest Item in TreeSet: " + smallestItem);

        if(num.isEmpty()) System.out.println("TreeSet is Empty");
        else System.out.println("TreeSet isn't Empty");

    }
}
