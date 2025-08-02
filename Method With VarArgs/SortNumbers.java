import java.util.Arrays;

public class SortNumbers{
    static void sortNumbers(int... numbers){
        System.out.println("Given numbers: " + Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("Sorted numbers: " + Arrays.toString(numbers));
    }
    public static void main(String[] args) {
        sortNumbers(43, 67, 66, 71, 70);
    }
}