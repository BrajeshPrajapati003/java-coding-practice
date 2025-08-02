public class QuickSort {
    public static int partition(int[] arr, int low, int high) {

        // Select the last element as the pivot
        int pivot = arr[high]; 

        // Index of smaller element and indicates the right position of pivot found so far
        int i = (low - 1); 

        for (int j = low; j < high; j++) {

            // If current element is smaller than the pivot
            if (arr[j] < pivot) {
                i++; 

                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Move pivot to its correct position
        i++; 
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;

        // Return the position of the pivot
        return i; 
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low <= high) {

            // Find the pivot index
            int pidx = partition(arr, low, high); 

            // Recursively sort the subarrays before and after the pivot
            quickSort(arr, low, pidx - 1); 
            quickSort(arr, pidx + 1, high); 
        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 2, 8};
        int n = arr.length;

        quickSort(arr, 0, n - 1);

        // Print the sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}