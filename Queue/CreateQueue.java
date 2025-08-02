import java.util.LinkedList;
import java.util.Queue;

public class CreateQueue{
    public static void main(String[] args){
        Queue<String> queue = new LinkedList<>();
        queue.add("Brajesh");
        queue.add("Kashish");
        queue.add("Kavita");
        queue.add("Vijay");

        System.out.println("Queue Elements: " + queue);
    }
}