import java.util.LinkedList;
import java.util.Queue;

public class IsEmptyQ{
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(43);
        queue.offer(66);
        queue.offer(67);
        queue.offer(70);
        System.out.println("Queue: " + queue);

        System.out.println("Queue is empty: " + queue.isEmpty());

        System.out.println("Removing all elements...");

        // queue.removeAll(queue);
        queue.clear();
        System.out.println("Queue is empty: " + queue.isEmpty());
    }
}