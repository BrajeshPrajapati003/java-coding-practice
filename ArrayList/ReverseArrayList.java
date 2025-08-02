import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("brajesh");
        list.add("kashish");
        list.add("mehak");
        list.add("kavita");
        list.add("Brajesh");

        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);
    }
}
