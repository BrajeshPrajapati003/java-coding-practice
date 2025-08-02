import java.util.List;
import java.util.stream.Collectors;

public class SecondLargestNumber {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,7,43,66);
        System.out.println("Given Numbers: " + list);

        List<Integer> sortedNumbers = list.stream().distinct().sorted().collect(Collectors.toList());
        
        if(sortedNumbers.size() >= 2){
            int secLargest = sortedNumbers.get(sortedNumbers.size()-2);
            System.out.println("Second largest number: " + secLargest);
        }else{
            System.out.println("List doesn't have a second largest number.");
        }
    }
}
