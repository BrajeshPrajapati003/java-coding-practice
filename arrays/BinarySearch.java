import java.util.Arrays;
import java.util.Scanner;
public class BinarySearch {

    //? Binary search works only in the case of a sorted array

    public static int binarySearch(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;

        while(low <= high){
            int mid = low+(high-low)/2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] < target){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in);){
            int[] arr = { 10, 11, 12, 15, 3, 7, 8 };
            Arrays.sort(arr);
            System.out.println("Array is: "+Arrays.toString(arr));
            System.out.println("Enter the element to search:");
            int target = sc.nextInt();

            int pos = binarySearch(arr, target);
            if(pos != -1){
                System.out.println("Element found at position : "+(pos+1));
            }else{
                System.out.println("Element not found!");
            }
        }
    }
}
