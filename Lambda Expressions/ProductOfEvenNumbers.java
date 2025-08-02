
import java.util.List;

public class ProductOfEvenNumbers {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6);
        System.out.println("Given List of Integers: " + list);

        int evenProduct = list.stream().filter(n -> n % 2 == 0).reduce(1, (a, b) -> a*b);
        System.out.println("Product of even numbers: " + evenProduct);
    }
}
