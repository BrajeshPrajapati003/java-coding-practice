import java.util.ArrayList;
import java.util.List;

public class MaxMinDifference {
    public static void main(String[] args) {
        List<Double> numbers = new ArrayList<>();
        numbers.add(10.5);
        numbers.add(43.5);
        numbers.add(66.5);
        numbers.add(67.5);

        System.out.println("Given numbers: " + numbers);
        double max = numbers.stream().max(Double::compareTo).orElse(0.0);
        double min = numbers.stream().min(Double::compareTo).orElse(0.0);

        double diff = max - min;
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        System.out.println("Difference: " + diff);
    }
}
