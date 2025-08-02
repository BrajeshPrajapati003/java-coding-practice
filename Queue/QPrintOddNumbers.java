
import java.util.LinkedList;
import java.util.Queue;

public class QPrintOddNumbers {

    public static void printOddNumbers(Queue<Integer> q){
        System.out.print("Odd numbers of the queue: ");
        for(int num: q){
            if(num % 2 != 0) System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.offer(5);
        q.offer(6);
        q.offer(7);
        q.offer(8);
        q.offer(9);
        q.offer(10);

        System.out.println("Given queue: " + q);
        printOddNumbers(q);
    }
}
