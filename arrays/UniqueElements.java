import java.util.Scanner;
public class UniqueElements {
    static void getUnique(int[] a, int n){
        for(int i=0; i<n; i++){
            int j;
            for(j=0; j<i; j++){
                if(a[i] == a[j]){
                    break;
                }
            }
            if(i == j){
                System.out.println(a[i]+" ");
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array limit: ");
        int l = sc.nextInt();
        int[] a = new int[l];

        for(int i=0; i<l; i++){
            System.out.printf("Element of a[%d]: ",i);
            a[i] = sc.nextInt();
        }
        System.out.println("\nDisplay Array unique elements...\n");
        getUnique(a, l);
    }
}
