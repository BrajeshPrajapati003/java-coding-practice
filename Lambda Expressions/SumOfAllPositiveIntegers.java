
import java.util.List;

public class SumOfAllPositiveIntegers {
    public static void main(String[] args) {
        List<Integer> list = List.of(43, 66,70, -25, -59);
        System.out.println("Given numbers: " + list);
        // int sum = list.stream().filter(n -> n > 0).reduce(0, (a,b) -> a+b);
        int sum = list.stream().filter(n -> n>0).mapToInt(Integer::intValue).sum();
        System.out.println("Sum of all positive integers: " + sum);
    }
}
