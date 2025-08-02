
import java.util.Arrays;

public class PreviousJustGreaterElement {
    public static int[] previosJustGreater(int[] arr){
        int n = arr.length;
        int[] res = new int[n];

        for(int i=0; i<n; i++){
            res[i] = -1;
            for(int j=i-1; j>=0; j--){
                if(arr[j] > arr[i]){
                    res[i] = arr[j];
                    break;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {

        int[] arr = {1, 5, 3, 2, 1, 6, 3, 4};
        System.out.println("Given array: " + Arrays.toString(arr));
        System.out.println(Arrays.toString(previosJustGreater(arr))); // [-1, -1, 5, 3, 2, -1, 6, 6]
    }
}
