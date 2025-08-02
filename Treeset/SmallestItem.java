import java.util.TreeSet;

public class SmallestItem {
    public static void main(String[] args) {
        TreeSet<Integer> num = new TreeSet<>();
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        num.add(50);

        int smallestItem = num.first();
        System.out.println("Smallest Item in TreeSet: " + smallestItem);
    }
}
