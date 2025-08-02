import java.util.HashSet;
import java.util.Spliterator;
public class usingSpliteratorMethod {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("hardik");
        set.add("brajesh");
        set.add("virat");
        set.add("rohit");
        set.add("bumrah");

        Spliterator<String> splt = set.spliterator();
        System.out.println("Hash Set Elements:");
        splt.forEachRemaining((n) -> System.out.println(n+" "));
    }
}
