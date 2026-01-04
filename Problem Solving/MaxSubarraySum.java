

public class MaxSubarraySum {

    public static int maxSubarraySum(int[] arr, int k) {
        int maxSum = 0;
        int sum = 0;
        int idx = 0;
        while(idx < arr.length && idx < k){
            sum += arr[idx];
            idx++;
        }
        
        maxSum = sum;
        for(int i=1; i<arr.length-k+1; i++){
            int prevElement = arr[i-1];
            int nextElement = arr[i+k-1];
            sum = sum - prevElement + nextElement;
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum;
        
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(maxSubarraySum(arr, 4));
    }
}
