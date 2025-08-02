import java.util.Scanner;
import java.util.Arrays;
public class CommonArrays {

    static void commonArray(int[] a, int[] b){

        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < b.length; j++){
                if(a[i] == b[j]) System.out.print(a[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the first array:");
        int aSize = sc.nextInt();
        int[] a = new int[aSize];
        System.out.println("Enter the elements of the first array:");
        for(int i = 0; i < aSize; i++){
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the size of the second array:");
        int bSize = sc.nextInt();
        int[] b = new int[bSize];
        System.out.println("Enter the elements of the second array:");
        for(int i = 0; i < bSize; i++){
            b[i] = sc.nextInt();
        }

        System.out.println("Array 1: " + Arrays.toString(a));
        System.out.println("Array 2: " + Arrays.toString(b));

        System.out.println("The third array is:");
        commonArray(a,b);
    }
}
