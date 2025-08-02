import java.util.TreeSet;

public class StrictlyLower {
    public static void main(String[] args) {
        TreeSet<Integer> num = new TreeSet<>();
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        num.add(50);

        System.out.println("TreeSet Element: " + num);

        int lower = num.lower(45); // 40
        System.out.println("Strictly Lower Element: " + lower);
    }
}
