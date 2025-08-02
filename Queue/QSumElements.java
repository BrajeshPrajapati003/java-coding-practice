
import java.util.LinkedList;
import java.util.Queue;

public class QSumElements{
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(43);
        q.offer(66);
        q.offer(67);

        int sum = 0;
        for(int num: q){
            sum += num;
        }

        System.out.println("Queue Elements Sum: " + sum);
    }
}