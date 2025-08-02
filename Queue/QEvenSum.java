
import java.util.LinkedList;
import java.util.Queue;

public class QEvenSum {
    public static int evenNumSum(Queue<Integer> q){
        int sum = 0;
        System.out.println("Even numbers:");
        for(int num: q){
            if(num % 2 == 0){
                sum += num;
                System.out.print(num + " ");
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.offer(66);

        int sum = evenNumSum(q);
        System.out.println("\nSum of even elements: " + sum);
    }
}
