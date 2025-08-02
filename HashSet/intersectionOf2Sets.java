import java.util.HashSet;
public class intersectionOf2Sets {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        hs.add(5);
        System.out.print("first set: ");
        System.out.println(hs);

        HashSet<Integer> set2 = new HashSet<Integer>();
        set2.add(6);
        set2.add(5);
        set2.add(7);
        set2.add(8);
        set2.add(9);
        set2.add(2);
        System.out.print("second set: ");
        System.out.println(set2);

        HashSet<Integer> intersection = new HashSet<>(hs);
        intersection.retainAll(set2);

        System.out.println(intersection);
    }
}
