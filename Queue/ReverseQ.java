
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQ {
    public static void reverseQ(Queue<Integer> q){
        Stack<Integer> stack = new Stack<>();
        while (!q.isEmpty()) {
            stack.push(q.poll());
        }

        while (!stack.isEmpty()) {
            q.offer(stack.pop());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(43);
        q.offer(66);
        q.offer(67);

        System.out.println("Original Queue: " + q);
        reverseQ(q);
        System.out.println("Reversed Queue: " + q);
    }
}
