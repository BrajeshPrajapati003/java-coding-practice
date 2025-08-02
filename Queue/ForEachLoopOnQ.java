import java.util.LinkedList;
import java.util.Queue;

public class ForEachLoopOnQ {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(43);
        queue.offer(66);
        queue.offer(67);
        queue.offer(70);
        
        for(int item: queue){
            System.out.print(item + " ");
        }
    }
}
