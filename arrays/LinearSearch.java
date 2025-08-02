import java.util.Arrays;
import java.util.Scanner;
public class LinearSearch {

    public static int linearSearch(int[] arr, int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                return (i+1);
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in);){
            int[] arr = { 10, 11, 12, 15, 3, 7, 8 };
            System.out.println("Array: "+Arrays.toString(arr));
            System.out.println("Enter element to search: ");
            int target = sc.nextInt();
            int idx = linearSearch(arr, target);

            if(idx != -1){
                System.out.println("Element found at position: "+idx);
            }else{
                System.out.println("Element is not present in the Array!");
            }
        }
    }
}
