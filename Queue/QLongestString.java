
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class QLongestString {

    public static String longestString(Queue<String> q){
        if(q.isEmpty()){
            throw new NoSuchElementException("Queue is empty!");
        }

        String longest = "";
        for(String str: q){
            if(str.length() > longest.length()){
                longest = str;
            }
        }
        return longest;
    }
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        q.offer("apple");
        q.offer("banana");
        q.offer("brajesh prajapati");
        q.offer("Brajesh");

        System.out.println("Given Strings: " + q);
        System.out.println("Longest String: " + longestString(q));
    }
}
