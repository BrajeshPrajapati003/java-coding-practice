import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,5,2,3,4,9,10);
        List<Integer> distNum = new ArrayList<>(numbers);
        distNum.removeIf(number -> numbers.indexOf(number) != numbers.lastIndexOf(number));

        System.out.println("Original numbers: " + numbers);
        System.out.println("Distinct numbers: " + distNum);
    }
}
