
import java.util.LinkedList;
import java.util.Queue;

public class QMaxElement {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);

        int maxElement = Integer.MIN_VALUE;
        
        for(int num: q){
            if(num > maxElement) maxElement = num;
        }

        System.out.println("Maximum element in the queue: " + maxElement);
    }
}
