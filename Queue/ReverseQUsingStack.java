import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQUsingStack {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        queue.offer(43);
        queue.offer(66);
        queue.offer(67);
        queue.offer(70);
        System.out.println("Queue: " + queue);

        // Reverse the queue
        while(!queue.isEmpty()){
            stack.push(queue.poll());
        }

        while(!stack.isEmpty()){
            queue.offer(stack.pop());
        }

        System.out.println("Reversed Queue: " + queue);
    }
}
