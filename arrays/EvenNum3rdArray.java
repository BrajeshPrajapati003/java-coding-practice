import java.util.Arrays;
import java.util.Scanner;
public class EvenNum3rdArray {

    static void evenArr(int[] a, int[] b){

        int k= 0;
        int[] c = new int[50];

        for(int i = 0; i < a.length; i++){
            if(a[i]%2 == 0) c[k++] = a[i];

        }
        for(int i = 0; i < b.length; i++){
            if(b[i]%2 == 0) c[k++] = b[i];
        }
        // System.out.println(Arrays.toString(c));
        //toString() can't be used here because it will print all of the 50 elements of the array C
        //but we have to print only those elements which are taken from either the first or the second array

        for(int i = 0; i < k; i++){
            System.out.print(c[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the first array:");
        int aSize = sc.nextInt();
        int[] a = new int[aSize];
        System.out.println("Enter the elements of the first array:");
        for(int i=0; i<a.length; i++) a[i] = sc.nextInt();

        System.out.println("Enter the size of the second array:");
        int bSize = sc.nextInt();
        int[] b = new int[bSize];
        System.out.println("Enter the elements of the second array:");
        for(int i=0; i<b.length; i++) b[i] = sc.nextInt();

        System.out.println("The first array is:");
        System.out.println(Arrays.toString(a));

        System.out.println("The second array is:");
        System.out.println(Arrays.toString(b));

        System.out.println("The third array will be: ");
        evenArr(a, b);

    }
}
