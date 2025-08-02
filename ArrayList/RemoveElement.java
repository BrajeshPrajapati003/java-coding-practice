import java.util.ArrayList;
import java.util.List;
public class RemoveElement {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("brajesh");
        list.add("kashish");
        list.add("kavita");
        list.add("kirti");
        // list.remove(3);
        list.remove("kirti");
        System.out.println(list);
    }
}
