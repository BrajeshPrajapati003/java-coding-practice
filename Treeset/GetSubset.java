import java.util.TreeSet;

public class GetSubset {
    public static void main(String[] args) {
        TreeSet<Integer> num = new TreeSet<>();
        num.add(30);
        num.add(40);
        num.add(10);
        num.add(20);
        num.add(60);

        TreeSet<Integer> subset = (TreeSet<Integer> ) num.subSet(20, 45);
        System.out.println("TreeSet Elements: " + num);
        System.out.println("Subset Elements: " + subset);
    }
}
