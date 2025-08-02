import java.util.HashSet;
public class removeElement {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        System.out.println("set is: "+ set);

        set.remove(3); // removes the specified element from the set
        System.out.println(set);
    }
}
