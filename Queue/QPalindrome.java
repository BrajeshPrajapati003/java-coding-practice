
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QPalindrome {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        queue.offer(66);
        queue.offer(43);
        queue.offer(66);
        // queue.offer(70);
        System.out.println("Queue: " + queue);

        Queue<Integer> originalQ = new LinkedList<>(queue);

        while(!queue.isEmpty()){
            stack.push(queue.poll());
        }
        while(!stack.isEmpty()){
            queue.offer(stack.pop());
        }

        // System.out.println("Queue is palindrome: " + queue.equals(originalQ));

        boolean isPalindrome = true;
        while (!originalQ.isEmpty()) {
            int currChar = queue.poll();
            int revQChar = originalQ.poll();
            if(currChar != revQChar){
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome) System.out.println("Palindrome");
        else System.out.println("Not a palindrome");
    }
}
