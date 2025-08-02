import java.util.HashSet;
import java.util.Iterator;
public class emptyTheSet {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        hs.add(5);
        System.out.println(hs);

        // hs.clear();
        // hs.removeAll(hs);
        // System.out.println(hs);

        //to get the number of elements in the set

        
        System.out.println(hs.size());

        for(int i: hs){
            System.out.print(i+ " ");
        }

        Iterator it = hs.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+ " ");
        }

    }
}
