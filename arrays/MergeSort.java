public class MergeSort {

    public static void conquer(int[] arr, int si, int mid, int ei) {

        // Create a temporary array to store the merged elements
        int[] merged = new int[ei - si + 1]; 

        // Initialize indices for the left and right subarrays
        int idx1 = si; 
        int idx2 = mid + 1; 
        int x = 0; // Index for the merged array

        // Merge the sorted left and right subarrays
        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] <= arr[idx2]) { 
                merged[x++] = arr[idx1++]; 
            } else {
                merged[x++] = arr[idx2++]; 
            }
        }

        // Copy any remaining elements from the left subarray
        while (idx1 <= mid) { 
            merged[x++] = arr[idx1++]; 
        }

        // Copy any remaining elements from the right subarray
        while (idx2 <= ei) { 
            merged[x++] = arr[idx2++]; 
        }

        // Copy the merged elements back to the original array
        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i]; 
        }
    }

    public static void divide(int arr[], int si, int ei) {

        // If the subarray has only one element, it's already sorted
        if (si >= ei) { 
            return;
        }

        // Find the middle index
        int mid = si + (ei - si) / 2; 

        // Recursively divide the left subarray
        divide(arr, si, mid); 

        // Recursively divide the right subarray
        divide(arr, mid + 1, ei); 

        // Merge the sorted subarrays
        conquer(arr, si, mid, ei); 
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 2, 8};
        int n = arr.length;

        divide(arr, 0, n - 1);

        // Print the sorted array
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}