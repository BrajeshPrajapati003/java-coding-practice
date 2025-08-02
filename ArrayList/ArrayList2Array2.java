import java.util.ArrayList;
import java.util.List;

public class ArrayList2Array2 {
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(2);
        list.add(1);
        System.out.println("Original list: " + list);

        // Converting ArrayList to Array of int[] using Streams (Java 8 & later)
        int[] arr = list.stream().mapToInt(Integer::intValue).toArray();

        for(int i: arr){
            System.out.print(i+" ");
        }
    }
}
