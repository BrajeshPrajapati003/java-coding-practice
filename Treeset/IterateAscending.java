import java.util.Iterator;
import java.util.TreeSet;

public class IterateAscending{
    public static void main(String[] args) {
        TreeSet<Integer> num = new TreeSet<>();
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        num.add(50);
        
        Iterator<Integer> itrAscending = num.iterator();
        System.out.println("Elements in Ascending order...");
        while (itrAscending.hasNext()) {
            System.out.print(itrAscending.next() + " ");
        }
    }
}
