import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QEquality {
    public static boolean areEqual(Queue<Integer> q1, Queue<Integer> q2){
        if(q1.size() != q2.size()) return false;

        Iterator<Integer> itr1 = q1.iterator();
        Iterator<Integer> itr2 = q2.iterator();

        while(itr1.hasNext()){
            if(!itr1.next().equals(itr2.next())) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
        q1.offer(1);
        q1.offer(2);
        q1.offer(3);

        Queue<Integer> q2 = new LinkedList<>();
        q2.offer(1);
        q2.offer(2);
        q2.offer(3);

        Queue<Integer> q3 = new LinkedList<>();
        q3.offer(3);
        q3.offer(2);
        q3.offer(1);

        System.out.println("Queue 1: " + q1);
        System.out.println("Queue 2: " + q2);
        System.out.println("Queue 3: " + q3);
        System.out.println("Queue 1 and Queue 2 equal?: " + areEqual(q1, q2));
        System.out.println("Queue 1 and Queue 3 equal?: " + areEqual(q1, q3));
    }
}
