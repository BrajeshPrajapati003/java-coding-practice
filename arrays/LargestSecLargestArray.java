public class LargestSecLargestArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3,3,5,6,31,89,90};

        int largest = arr[0];
        int secondLargest = largest;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            }
        }
        System.out.println("Largest element: "+largest);
        System.out.println("Second largest element: "+secondLargest);
    }
}
