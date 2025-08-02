import java.util.TreeSet;

public class GetFlooring {
    public static void main(String[] args) {
        TreeSet<Integer> num = new TreeSet<>();
        num.add(30);
        num.add(40);
        num.add(10);
        num.add(20);
        num.add(60);

        int value = num.floor(27);
        System.out.println("Flooring value for 27: " + value);
    }
}
