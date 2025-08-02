public class PerformAction {
    public static void main(String[] args) {
        int[] arr = {3,3,3,3,3,4,4};
        System.out.println(perform(arr));
    }

    public static int perform(int[] arr){
        int prev = -1;
        int n = arr.length;
        for(int i=1; i<n; i++){
            if(arr[i] == 4) return (i-prev);
        }
        return prev;
    }
}