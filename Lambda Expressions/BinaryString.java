
import java.util.ArrayList;
import java.util.List;

interface NumberConverter{
    String convert(int num);
}

public class BinaryString {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println("Given Numbers: " + numbers);
        List<String> binaryStrings = convert2Binary(numbers, Integer::toBinaryString);
        System.out.println("Binary Number: " + binaryStrings);
    }

    // ! Warning: Exporting non-public type through public API (convert2Binary)

    public static List<String> convert2Binary(List<Integer> list, NumberConverter converter){
        List<String> result = new ArrayList<>();
        for(Integer num: list){
            result.add(converter.convert(num));
        }
        return result;
    }
}
