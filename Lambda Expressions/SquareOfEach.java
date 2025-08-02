
import java.util.ArrayList;
import java.util.List;

public class SquareOfEach {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // Define the lambda expression to square each number
        List<Integer> squaredNum = sqNumbers(list);

        // Print the squared numbers
        System.out.println("Given numbers: " + list);
        System.out.println("Squared numbers: " + squaredNum);
    }

    public static List<Integer> sqNumbers(List<Integer> numbers){
        // Use lambda expression to square each number
        List<Integer> squaredNumbers = new ArrayList<>();
        numbers.forEach(num -> squaredNumbers.add(num * num));
        return squaredNumbers;
    }
}
