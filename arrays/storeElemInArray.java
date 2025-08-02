import java.util.Scanner;
public class storeElemInArray {
    public static void main(String[] args) {

        //creating scanner object sc
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int length = sc.nextInt();
        int[] arr = new int[length];

        //insert array elements
        System.out.println("Enter the elements:");
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }

        //print array elements
        System.out.println("Array elements are: ");
        for (int i: arr) {
            System.out.print(i+" ");
        }
    }
}
