import java.util.ArrayList;
import java.util.List;

public class ArrayList2Array {
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

        // int[] arr = new int[list.size()];
        // for(int i=0; i<list.size(); i++){
        //     arr[i] = list.get(i); // Auto-unboxing
        // }
        // for(int i: arr) System.out.print(i+" ");

        Object[] arr = list.toArray();
        for(Object ob: arr){
            System.out.print(ob+" ");
        }
    }
}