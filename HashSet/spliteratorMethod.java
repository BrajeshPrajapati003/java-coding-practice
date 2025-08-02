import java.util.HashSet;
import java.util.Spliterator;
public class spliteratorMethod {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        System.out.println(" fist set is: "+ set);

        Spliterator<Integer> splt = set.spliterator();
        System.out.println("Hash Set elements: ");
        splt.forEachRemaining((n) -> System.out.print(n+" "));
    }
}
