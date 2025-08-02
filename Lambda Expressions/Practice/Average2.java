
import java.util.Arrays;
import java.util.List;
public class Average2 {
    public static void main(String[] args) {
        List<Double> list = Arrays.asList(1.1,2.2,3.3,4.4,5.5);
        double sum = list.stream().mapToDouble(Double::doubleValue).sum();
        double avg = sum/list.size();
        System.out.println("Average: " + avg);
    }
}
