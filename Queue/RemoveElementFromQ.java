
import java.util.LinkedList;
import java.util.Queue;

public class RemoveElementFromQ {
    public static void removeElement(Queue<Integer> q, int elem){
        int size = q.size();
        for(int i=0; i<size; i++){
            int currElem = q.poll();
            if(currElem != elem){
                q.offer(currElem);
            }
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(20);

        System.out.println("Original Queue: " + q);
        int element2Remove = 20;
        removeElement(q, element2Remove);
        System.out.println("Queue after removing " + element2Remove + " : " + q);

    }
}
