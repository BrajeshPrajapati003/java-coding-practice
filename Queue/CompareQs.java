import java.util.LinkedList;
import java.util.Queue;

public class CompareQs {
    public static void main(String[] args) {
        Queue<Integer> queue1 = new LinkedList<>();
        queue1.offer(43);
        queue1.offer(66);
        queue1.offer(67);
        queue1.offer(70);
        System.out.println("Queue 1: " + queue1);

        Queue<Integer> queue2 = new LinkedList<>();
        queue2.offer(43);
        queue2.offer(66);
        queue2.offer(67);
        System.out.println("Queue 2: " + queue2);

        if(queue1.equals(queue2)){
            System.out.println("The queues are equal");
        }else{
            System.out.println("The queues are not equal");
        }
    }
}
