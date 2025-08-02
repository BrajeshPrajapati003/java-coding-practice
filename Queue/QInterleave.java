import java.util.LinkedList;
import java.util.Queue;

public class QInterleave {
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        q1.offer(1);
        q1.offer(2);
        q1.offer(3);
        q1.offer(4);

        q2.offer(6);
        q2.offer(7);
        q2.offer(8);
        q2.offer(9);

        System.out.println("First Queue elements: " + q1);
        System.out.println("Second Queue elements: " + q2);

        // Interleaving the elements of two queues
        Queue<Integer> resQ = new LinkedList<>();
        while(!q1.isEmpty() && !q2.isEmpty()){
            resQ.offer(q1.poll());
            resQ.offer(q2.poll());
        }

        while(!q1.isEmpty()){
            resQ.offer(q1.poll());
        }

        while (!q2.isEmpty()) {
            resQ.offer(q2.poll());
        }

        System.out.println("Interleaved Queue Elements: " + resQ);
    }
}
