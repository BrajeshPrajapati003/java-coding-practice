import java.util.Scanner;
public class MakeUnique {

    static void makeUniq(int[] a){
        int n = a.length;
        for(int i = 0; i < n; i++){
            int j;
            for(j = 0; j < i; j++){

                if(a[i] == a[j]) break;
            }
            if(i==j) System.out.print(a[i] + " ");
        }
    }
    public static void main(String[] args) {

        System.out.println("enter the size of the array:");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] a = new int[size];

        //enter the elements of the array
        for(int i=0; i<size; i++){
            a[i] = sc.nextInt();
        }

       makeUniq(a);
    }
}