import java.util.HashSet;
public class cloneASet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        System.out.println("set is: "+ set);

        HashSet<Integer> set2 = new HashSet<>(set);
        System.out.println(set);

        HashSet<Integer> set3 = new HashSet<>();
        set3 = (HashSet) set.clone();
        System.out.println(set3);
    }
}
