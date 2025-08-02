
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class SecSmallestInQ {
    public static int secSmallestElement(Queue<Integer> q){
        if(q.size() < 2){
            throw new NoSuchElementException("Queue doesn't have enough elements!");
        }

        int smallest = Integer.MAX_VALUE;
        int secSmallest = Integer.MAX_VALUE;
        for(int num: q){
            if(num < smallest){
                secSmallest = smallest;
                smallest = num;
            }else if(num < secSmallest && num != smallest){
                secSmallest = num;
            }
        }
        return secSmallest;
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.offer(0);
        
        System.out.println("Original Queue: " + q);
        System.out.println("Second smallest element: " + secSmallestElement(q));
    }
}
