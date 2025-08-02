import java.util.ArrayList;
import java.util.List;

public class SearchElement {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(43);
        list.add(66);
        if(list.contains(66)){
            System.out.println("Found the element!");
        }else{
            System.out.println("Element not found!");
        }
    }
}
