
import java.util.LinkedList;
import java.util.Queue;

public class QMerge {
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        q1.offer(43);
        q1.offer(66);
        q1.offer(67);

        q2.offer(71);
        q2.offer(70);

        Queue<Integer> mergedQ = new LinkedList<>();
        mergedQ.addAll(q1);
        mergedQ.addAll(q2);

        System.out.println("Merged Queue: ");
        System.out.println(mergedQ);
    }
}
