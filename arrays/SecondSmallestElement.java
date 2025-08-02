import java.util.Scanner;
public class SecondSmallestElement {

    static void secondSmallest(int[] a, int n){

        //sort the given array
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                
                //swap
                if(a[i] > a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for(int i = 0; i < n; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("The second smallest element is: " + a[1]);
    }
    public static void main(String[] args) {
        System.out.println("Enter the size of the array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        int[] a = new int[size];
        for(int i=0; i<size; i++) {
            a[i] = sc.nextInt();
        }

        secondSmallest(a, size);
    }
}
