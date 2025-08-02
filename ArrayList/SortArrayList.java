import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class SortArrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("brajesh");
        list.add("kashish");
        list.add("mehak");
        list.add("kavita");
        list.add("Brajesh");
        Collections.sort(list);
        System.out.println(list);
    }
}
