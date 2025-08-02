
import java.util.LinkedList;
import java.util.Queue;

public class ReverseQRecursion {

    public static void reverseQ(Queue<Integer> q){
        if(q.isEmpty()) return;

        int frontElement = q.poll();
        reverseQ(q);
        q.offer(frontElement);
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);

        System.out.println("Original Queue: " + q);
        reverseQ(q);
        System.out.println("Reversed Queue: " + q);
    }
}
