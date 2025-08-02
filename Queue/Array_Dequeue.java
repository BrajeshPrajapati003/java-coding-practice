
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

public class Array_Dequeue {
    public static void main(String[] args) {
        Queue<String> queueList = new ArrayDeque<>();
        queueList.add("Brajesh");
        queueList.add("Kashish");
        queueList.add("Kavita");
        queueList.add("Vijay");

        Iterator<String> itr = queueList.iterator();
        System.out.println("Queue elements: ");
        while(itr.hasNext()){
            System.out.print(itr.next() + " ");
        }
    }
}