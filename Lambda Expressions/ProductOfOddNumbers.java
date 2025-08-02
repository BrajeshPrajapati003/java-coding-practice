
import java.util.List;

public class ProductOfOddNumbers {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9);
        System.out.println("Given numbers: " + list);
        int product = list.stream().filter(n -> n%2 != 0).reduce(1, (x,y) -> x*y);
        System.out.println("Product of All Odd Numbers: " + product);
    }
}
