import java.util.TreeSet;

public class StrictlyGreater {
    public static void main(String[] args) {
        TreeSet<Integer> num = new TreeSet<>();
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        num.add(50);

        System.out.println("TreeSet Element: " + num);

        int higher = num.higher(20); // 30
        System.out.println("Strictly Higher Element: " + higher);
    }
}
