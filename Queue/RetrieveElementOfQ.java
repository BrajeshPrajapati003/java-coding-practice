import java.util.LinkedList;
import java.util.Queue;

public class RetrieveElementOfQ{
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(43);
        queue.offer(66);
        queue.offer(67);
        queue.offer(70);
        System.out.println("Queue: " + queue);

        System.out.println("Element at the head of the queue: " + queue.peek());
        System.out.println("Queue after peeked: " + queue);
    }
}