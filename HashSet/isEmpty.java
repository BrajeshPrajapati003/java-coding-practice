import java.util.HashSet;
public class isEmpty {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        hs.add(5);

        System.out.println(hs);
        if(hs.isEmpty()) System.out.println("set is empty");
        else System.out.println("set is not empty");
        
        // hs.clear(); // clears all the elements from hs
        hs.removeAll(hs); // removes all the elements from the passed set that is hs
        System.out.println(hs);
    }
}
