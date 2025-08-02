import java.util.HashSet;
import java.util.Iterator;
public class traverseSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        System.out.println("set is: "+ set);


        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
    //     for(int i: set){
    //         System.out.print(i+ " ");
    //     }
    }
}
