import java.util.Scanner;
import java.util.Arrays;
public class OddNum3rdArray {

    static void oddNumArr(int[] a, int[] b){

        int k=0;
        int[] c = new int[50];
        for (int i = 0; i < a.length; i++){
            if(a[i] %2 != 0) c[k++] = a[i];
        }
        for(int i = 0; i < b.length; i++){
            if(b[i] %2 != 0) c[k++] = b[i];
        }

        for(int i = 0; i < k; i++){
            
            //? Printf provides more formatting ways than println
            System.out.printf("c[%d] = %d\n", i, c[i]);
            //Here printf comes instead of print only just like in C language
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the first array:");
        int aSize = sc.nextInt();
        int[] a  = new int[aSize];
        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < aSize; i++) a[i] = sc.nextInt();

        System.out.println("Enter the size of the second array:");
        int bSize = sc.nextInt();
        int[] b = new int[bSize];
        System.out.println("Enter the elements of the second array:");
        for (int i =0; i < bSize; i++) b[i] = sc.nextInt();

        System.out.println("The first array is:");
        System.out.println(Arrays.toString(a));

        System.out.println("The second array is:");
        System.out.println(Arrays.toString(b));

        System.out.println("The third array is: ");
        oddNumArr(a,b);
    }
}