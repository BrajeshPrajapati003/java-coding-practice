public class PositiveElementSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,-4,-7,-9,-10,11,12};

        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i]>0) sum+=arr[i];
        }
        System.out.println(sum);
    }
}
