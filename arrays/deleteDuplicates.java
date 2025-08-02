import java.util.Arrays;
public class deleteDuplicates{
    public static void main(String[] args) {
        int[] arr = new int[]{1, 43, 66, 67, 66, 66, 43};
        int n = arr.length;

        Arrays.sort(arr);
        n = removeDuplicates(arr, n);
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static int removeDuplicates(int[] a, int n) {
        if (n == 0 || n == 1) {
            return n;
        }
    
        int i = 0; // Index for unique elements
        for (int j = 1; j < n; j++) { 
            if (a[i] != a[j]) {
                i++; 
                a[i] = a[j]; 
            }
        }
    
        // Return the new length of the array
        return i + 1; 
    }
    
}