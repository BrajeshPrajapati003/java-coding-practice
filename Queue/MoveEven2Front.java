
import java.util.LinkedList;
import java.util.Queue;

public class MoveEven2Front {
    public static void moveEven(Queue<Integer> q){
        int size = q.size();
        Queue<Integer> tempQ = new LinkedList<>();

        for(int i=0; i<size; i++){
            int currElem = q.poll();
            if(currElem % 2 == 0){
                q.offer(currElem);
            }else{
                tempQ.offer(currElem);
            }
        }

        while(!tempQ.isEmpty()){
            q.offer(tempQ.poll());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.offer(6);

        System.out.println("Original Queue: " + q);
        moveEven(q);
        System.out.println("Queue after moving even to front: " + q);
    }
}
