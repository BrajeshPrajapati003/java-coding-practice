// import java.util.Arrays;
public class CubicElemOfArray {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6};

        // for(int i = 0; i < arr.length; i++){
        //     arr[i] = arr[i]*arr[i]*arr[i];

        // }

        for(int i: arr){
            System.out.print(i*i*i+" ");
        }
        //print the cubic elements of the array
        // System.out.println(Arrays.toString(arr));

    }
}
