import java.util.Arrays;
import java.util.List;
public class MinimumNumber {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(43, 66, 67, 71, 70);
        int minNum = num.stream().min(Integer::compare).orElse(0);
        System.out.println("Minimum Value: " + minNum);
    }
}
