import java.util.Scanner;
public class EnterDisplayArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("enter the elements:");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("The enterd array is:");
        for(int i: arr){
            System.out.print(i+" ");
        }
    }
}
