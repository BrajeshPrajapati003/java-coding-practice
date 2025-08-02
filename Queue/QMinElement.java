import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class QMinElement {
    public static int findMinElem(Queue<Integer> q){
        if(q.isEmpty()){
            throw new NoSuchElementException("Queue is Empty");
        }

        int min = Integer.MAX_VALUE;
        for(int num: q){
            if(num < min) min = num;
        }

        return min;
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(50);
        q.offer(20);
        q.offer(80);
        q.offer(43);

        int minElem = findMinElem(q);
        System.out.println("Minimum element in the queue: " + minElem);
    }
}
