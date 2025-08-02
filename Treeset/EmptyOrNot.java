import java.util.TreeSet;

public class EmptyOrNot {
    public static void main(String[] args) {
        TreeSet<Integer> num = new TreeSet<>();
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        num.add(50);

        if(num.isEmpty()) System.out.println("TreeSet is Empty");
        else System.out.println("TreeSet isn't Empty");
    }
}
