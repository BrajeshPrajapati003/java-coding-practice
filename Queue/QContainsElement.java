import java.util.LinkedList;
import java.util.Queue;

public class QContainsElement {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(43);
        q.offer(66);
        q.offer(67);

        int target = 66;

        // boolean found = false;
        // for(int num: q){
        //     if(num == target){
        //         found = true;
        //         break;
        //     }
        // }

        boolean found = q.contains(target);
        if(found){
            System.out.println("Element found");
        }else{
            System.out.println("Element not found");
        }

    }
}
