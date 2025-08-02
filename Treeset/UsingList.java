import java.util.ArrayList;
import java.util.TreeSet;
import java.util.List;

public class UsingList {
    public static void main(String[] args) {
        List col = new ArrayList();
        col.add("blue");
        col.add("red");
        col.add("green");
        col.add("white");
        col.add("pink");

        TreeSet<Integer> tree = new TreeSet<Integer>(col);
        System.out.println("TreeSet Elements: " + tree);

    }
}
