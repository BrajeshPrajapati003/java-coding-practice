import java.util.TreeSet;

public class NoCommonElements {
    public static void main(String[] args) {
        TreeSet<String> num1 = new TreeSet<>();
        num1.add("blue");
        num1.add("yellow");
        num1.add("brajesh");

        TreeSet<String> num2 = new TreeSet<>();
        num2.add("orange");
        num2.add("green");
        num2.add("brajesh");

        System.out.println("Treeset 1 Elements: " + num1);
        System.out.println("TreeSet 2 Elements: " + num2);

        num1.addAll(num2);
        System.out.println("\nTreeSet 1 Elements" + num1);
        System.out.println("TreeSet 2 Elements: " + num2);
    }
}
