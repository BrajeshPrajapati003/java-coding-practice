import java.util.Iterator;
import java.util.TreeSet;

public class IterateDescending {
    public static void main(String[] args) {
        TreeSet<Integer> num = new TreeSet<>();
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        num.add(50);
        
        Iterator<Integer> itr = num.descendingIterator();
        System.out.println("Elements in Descending Order:");
        while (itr.hasNext()) {
            System.out.println(itr.next());
            
        }
    }
}
