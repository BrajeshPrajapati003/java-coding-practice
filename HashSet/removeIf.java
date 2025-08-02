import java.util.HashSet;
public class removeIf {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        System.out.println("Printing the Hash Set Elements:");
        set.removeIf(val -> (val>3));
        System.out.println(set);
    }
}
