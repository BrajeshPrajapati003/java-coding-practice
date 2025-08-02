import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Reverse1stHalfQ {
    public static void reverseHalf(Queue<Integer> q){
        int size = q.size();
        int halfSize = size/2;

        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<halfSize; i++){
            stack.push(q.poll());
        }

        while(!stack.isEmpty()){
            q.offer(stack.pop());
        }

        for(int i=0; i<size - halfSize; i++){
            q.offer(q.poll());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.offer(5);
        // q.offer(6);
        System.out.println("Original Queue: " + q);
        reverseHalf(q);
        System.out.println("Queue after reversign first half: " + q);
    }
}
