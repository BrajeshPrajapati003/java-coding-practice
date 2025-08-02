
import java.util.LinkedList;
import java.util.Queue;

public class QPrintPositiveNumbers {
    public static void printPositiveNumbers(Queue<Integer> q){
        System.out.print("Positive numbers of the queue: ");
        for(int num: q){
            if(num>0){ // 0 is not a positive number
                System.out.print(num + " ");
            }
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(-1);
        q.offer(0);
        q.offer(-2);
        q.offer(-3);
        q.offer(2);
        q.offer(43);

        System.out.println("Original Queue: " + q);
        printPositiveNumbers(q);
    }
}
