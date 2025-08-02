public class BubbleSort {
    public static int[] bubbleSort(int[] arr){

        //? SORT IN DESCENDING ORDER

        for(int i=0; i<arr.length-1; i++){
            for(int j=i; j<arr.length-i-1; j++){
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        //? SORT IN ASCENDING ORDER

        // for(int i=0; i<arr.length-1; i++){
        //     for(int j=i; j<arr.length-i-1; j++){
        //         if(arr[i]>arr[j]){
        //             int temp = arr[i];
        //             arr[i] = arr[j];
        //             arr[j] = temp;
        //         }
        //     }
        // }

        return arr;
    }
    public static void main(String[] args) {
        int[] arr = { 10, 11, 12, 15, 3, 7, 8 };
        arr = bubbleSort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}