import java.util.Scanner;
import java.util.Arrays;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];

        //take inputs in array
        System.out.println("enter the elements:");
        for(int i = 0; i < len; i++){
            arr[i] = sc.nextInt();
        }

        //sort in increasing order and print the reversed array
        Arrays.sort(arr);
        for(int i = len-1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
    }
}
