public class MaxMin {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,54,53,253,400,400};

        int max = arr[0];
        int min = arr[0];
        for(int i = 0; i <arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }

        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
    }
}
