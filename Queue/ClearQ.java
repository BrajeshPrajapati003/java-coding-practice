
import java.util.LinkedList;
import java.util.Queue;

public class ClearQ {
    public static void clearQueue(Queue<Integer> q){
        q.clear();
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);

        System.out.println("Original Queue: " + q);
        clearQueue(q);
        System.out.println("Cleared queue: " + q);
    }
}
