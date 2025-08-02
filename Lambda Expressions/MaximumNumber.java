import java.util.Arrays;
import java.util.List;
import java.util.Optional;
public class MaximumNumber {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(43, 66, 67, 71);

        Optional<Integer> maxNum = num.stream().reduce((a,b) -> a>b ? a:b);

        if(maxNum.isPresent()){
            System.out.println("Maximum number: " + maxNum.get());
        }else{
            System.out.println("Numbers not found!");
        }
    }
}
