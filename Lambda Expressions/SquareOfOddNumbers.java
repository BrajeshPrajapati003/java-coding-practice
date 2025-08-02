
import java.util.List;
import java.util.stream.Collectors;
public class SquareOfOddNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        System.out.println("Original numbers: " + numbers);
        List<Integer> squareNum = numbers.stream().filter(num -> num % 2 != 0).map(n -> n*n).collect(Collectors.toList());
        System.out.println("Squared numbers: " + squareNum);

    }
}
