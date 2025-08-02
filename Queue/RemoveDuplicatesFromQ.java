
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class RemoveDuplicatesFromQ {

    // ! Method 1
    // public static Queue<Integer> removeDuplicates(Queue<Integer> q){
    //     HashSet<Integer> set = new HashSet<>(q);
    //     q.clear();
    //     q.addAll(set);
    //     return q;
    // }


    // ! method 2
    public static void removeDuplicates(Queue<Integer> q){
        Set<Integer> set = new HashSet<>();
        int size = q.size();

        for(int i=0; i<size; i++){
            int elem = q.poll();
            if(!set.contains(elem)){
                q.offer(elem);
                set.add(elem);
            }
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(43);
        q.offer(43);
        q.offer(36);
        q.offer(32);
        q.offer(27);

        System.out.println("Given Queue: " + q);
        removeDuplicates(q);
        System.out.println("Queue after removing duplicates: " + q);
    }
}
