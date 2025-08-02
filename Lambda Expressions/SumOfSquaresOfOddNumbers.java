
import java.util.List;

public class SumOfSquaresOfOddNumbers{
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8);
        System.out.println("Given numbers: " + list);

        // int oddSum = list.stream().filter(n -> n%2 != 0).mapToInt(Integer::intValue).map(n -> n*n).reduce(0, (a,b) -> a+b);

        // ? .mapToInt(Integer::intValue) is unnecessary -> After you apply a filter, you apply mapToInt(n -> n*n). This produces an IntStream. Therefore the Integer::intValue is not needed.

        int oddSum = list.stream().filter(n -> n%2 != 0).mapToInt(n -> n*n).sum();
        System.out.println("Sum of odd numbers: " + oddSum);
    }
}