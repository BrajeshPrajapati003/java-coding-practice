import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseIteratorMethodOnQ {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(43);
        queue.offer(66);
        queue.offer(67);
        queue.offer(70);
        
        Iterator<Integer> itr = queue.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }


    }
}
