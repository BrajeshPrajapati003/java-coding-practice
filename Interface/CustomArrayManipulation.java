
import java.util.Arrays;

interface ArrayProcessor{
    void processArray(int[] arr);
}

public class CustomArrayManipulation {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        ArrayProcessor doubler = arr -> {
            for(int i=0; i<arr.length; i++){
                arr[i] *= 2;
            }
        };    

        doubler.processArray(numbers);
        System.out.println("Doubled Array: " + Arrays.toString(numbers));
    }
}
