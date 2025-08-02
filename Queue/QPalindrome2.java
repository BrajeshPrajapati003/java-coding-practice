
import java.util.ArrayDeque;
import java.util.Deque;

public class QPalindrome2 {
    public static void main(String[] args) {
        Deque<Character> deque = new ArrayDeque<>();
        deque.offer('r');
        deque.offer('a');
        deque.offer('d');
        deque.offer('a');
        deque.offer('r');
        
        boolean isPalindrome = true;

        while(deque.size() > 1){
            char first = deque.pollFirst();
            char last = deque.pollLast();
            if(first != last){
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome) System.out.println("Deque is palindrome");
        else System.out.println("Deque isn't palindrome");
    }
}
