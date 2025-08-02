import java.util.HashSet;

public class unionOf2Sets {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        System.out.println("first set: ");
        for(int i: set1) System.out.print(i+" ");
        System.out.println();

        HashSet<Integer> set2 = new HashSet<Integer>();
        set2.add(6);
        set2.add(5);
        set2.add(7);
        set2.add(8);
        set2.add(9);
        set2.add(2);
        System.out.println("second set:");
        for(int i: set2) System.out.print(i+ " ");
        System.out.println();

        HashSet<Integer> unionSet = new HashSet<Integer>(set1);
        // unionSet.addAll(set1);
        unionSet.addAll(set2);

        System.out.println("union of the two sets:");
        for(int i: unionSet) System.out.print(i+ " ");

    }
}
