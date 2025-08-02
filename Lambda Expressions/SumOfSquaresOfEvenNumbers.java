import java.util.ArrayList;
import java.util.List;

public class SumOfSquaresOfEvenNumbers {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Given numbers: " + list);
        int sumSquares = list.stream().filter(n -> n%2 == 0).map(n -> n*n).reduce(0, Integer::sum);
        System.out.println("Sum of squares of even numbers: " + sumSquares);

    }
}
