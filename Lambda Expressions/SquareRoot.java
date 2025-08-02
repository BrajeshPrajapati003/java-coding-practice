
import java.util.Arrays;
import java.util.List;

public class SquareRoot {
    public static void main(String[] args) {
        List<Double> list = Arrays.asList(16.0, 5.0, 25.0, 9.0, 36.0);
        list.forEach((num) -> {
            double SquareRoot = Math.sqrt(num);
            System.out.println("Square root of " + num + ": " + SquareRoot);
        });
    }
}
