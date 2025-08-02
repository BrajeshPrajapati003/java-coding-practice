import java.util.List;
import java.util.ArrayList;
public class InsertElement {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Brajesh");
        list.add("Kavita");
        // list.addFirst("Kashish");
        // list.addLast("Mehak");
        list.add(0, "Kashish");
        list.add(3,"Mehak");
        System.out.println(list);
    }
}
