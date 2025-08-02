public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {0,7,8,3,1,2};

        //? Selection Sort in Ascending order

        // for(int i=0; i<arr.length-1; i++){
        //     int minIndex = i;
        //     for(int j=i+1; j<arr.length; j++){
        //         if(arr[minIndex]>arr[j]){
        //             minIndex = j;
        //         }
        //     }
        //     int temp = arr[minIndex];
        //     arr[minIndex] = arr[i];
        //     arr[i] = temp;
        // }

        //? Selection sort in Descending order

        for(int i=0; i<arr.length; i++){
            int largest = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[largest] < arr[j]){
                    largest = j;
                }
            }
            int temp = arr[largest];
            arr[largest] = arr[i];
            arr[i] = temp;

        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}