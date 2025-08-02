import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Brajesh");
        list.add("Kashish");
        list.add("Kavita");
        // list.removeAll(list);
        if(list.isEmpty()) System.out.println("List is Empty....");
        else System.out.println("List isn't empty....");
    }
}
