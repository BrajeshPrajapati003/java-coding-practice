
import java.util.List;
import java.util.Optional;

public class LargestEvenNumber {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,7,43,66);
        System.out.println("Given Numbers: " + list);
        Optional<Integer> largestEven = list.stream().filter(n -> n%2 == 0).max(Integer::compareTo);
        if(largestEven.isPresent()){
            // System.out.println("Largest Even: " + largestEven); // Largest Even: Optional[66]
            System.out.println("Largest Even: " + largestEven.get()); // Largest Even: 66
        }else{
            System.out.println("No even numbers found!");
        }
    }
}
