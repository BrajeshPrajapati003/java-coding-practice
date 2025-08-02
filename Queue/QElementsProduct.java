
import java.util.LinkedList;
import java.util.Queue;

public class QElementsProduct {
    public static long elementsProduct(Queue<Integer> q){
        long product = 1;
        for(int num: q){
            product *= num;
        }
        return product;
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.offer(5);

        System.out.println("Given queue: " + q);
        System.out.println("Product of queue elements: " + elementsProduct(q));
    }
}
