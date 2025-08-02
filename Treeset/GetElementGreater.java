import java.util.TreeSet;

public class GetElementGreater {
    public static void main(String[] args) {
        TreeSet<Integer> num = new TreeSet<>();
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        num.add(50);
        TreeSet<Integer> tailSet = (TreeSet<Integer> ) num.tailSet(40);
        System.out.println("TreeSet element: " + num);
        System.out.println("Tail Set: " + tailSet); // Tail Set: [40, 50]
    }
}
