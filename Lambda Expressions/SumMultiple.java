import java.util.ArrayList;
import java.util.List;

public class SumMultiple {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int mul = list.stream().reduce(1, (a, b) -> a * b); // Multiply all elements together

        System.out.println("Multiplication of elements: " + mul);
        int sum = list.stream().reduce(0, (a, b) -> a + b); // Sum all elements

        System.out.println("Sum of Elements: " + sum);

    }
}
