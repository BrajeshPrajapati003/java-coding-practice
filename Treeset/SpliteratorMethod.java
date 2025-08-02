import java.util.Spliterator;
import java.util.TreeSet;

public class SpliteratorMethod {
    public static void main(String[] args) {
        TreeSet<Integer> num = new TreeSet<>();
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        num.add(50);

        Spliterator<Integer> splt = num.spliterator();
        System.out.println("Elements of TreeSet...");
        splt.forEachRemaining(System.out::println);
    }
}
