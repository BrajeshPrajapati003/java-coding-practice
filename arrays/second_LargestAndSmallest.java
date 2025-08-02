import java.util.Arrays;
public class second_LargestAndSmallest {
    public static void main(String[] args) {
        int[] arr = new int[]{0,2,3,1,6,7,9,6,0,66,43,66,43};
        int smallest = arr[0];
        int secSmallest = arr[0];

        //? This method will not work if the first element is the smallest element
        // for(int i=0; i<arr.length; i++){
        //     if(arr[i]<smallest){
        //         secSmallest = smallest;
        //         smallest = arr[i];
        //     }
        // }

        Arrays.sort(arr);
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] != arr[i+1]){
                smallest = arr[i];
                secSmallest = arr[i+1];
                break;
            }
        }

        int largest = arr[0], secLargest = arr[0];
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i] != arr[i-1]){
                largest = arr[i];
                secLargest = arr[i-1];
                break;
            }
        }

        System.out.println("Largest: "+largest);
        System.out.println("Second Largest: "+secLargest);

        System.out.println("Smallest: "+smallest);
        System.out.println("Second Smallest: "+secSmallest);
    }
}
