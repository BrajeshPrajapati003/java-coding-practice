
import java.util.stream.IntStream;
public class SumOfSquareNumber {
    public static void main(String[] args){

        int sumOfSquare = IntStream.rangeClosed(1, 10).map(n -> n*n).sum();
        System.out.println("Sum of square of all numbers from 1 to 10: " + sumOfSquare);

    }
}
