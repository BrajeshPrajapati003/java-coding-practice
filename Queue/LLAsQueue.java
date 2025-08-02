
import java.util.LinkedList;
import java.util.Queue;

public class LLAsQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(43);
        queue.offer(66);
        queue.offer(67);
        queue.offer(70);

        System.out.println("Queue: " + queue);

        int first = queue.poll();
        System.out.println("Removed: " + first);
        System.out.println("Queue: " + queue);

        int peekd = queue.peek();
        System.out.println("Peeked: " + peekd);
        System.out.println("Queue: " + queue);
    }
}
