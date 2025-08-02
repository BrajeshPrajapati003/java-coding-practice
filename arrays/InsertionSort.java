public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 2, 8};

        // Iterate through the array, starting from the second element
        for (int i = 1; i < arr.length; i++) { 

            // Store the current element 
            int current = arr[i]; 

            // Initialize an index 'j' to point to the element before the current element
            int j = i - 1; 

            // Shift elements to the right as long as 'j' is within bounds and the current element is smaller
            while (j >= 0 && current < arr[j]) { 
                
                // Shift the element at index 'j' to the right
                arr[j + 1] = arr[j]; 
                // Decrement 'j' to compare with the next element on the left
                j--; 
            }

            // Insert the current element at the correct position
            arr[j + 1] = current; 
        }

        // Print the sorted array
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}