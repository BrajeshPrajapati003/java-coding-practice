public class BinarySearch {
    public static void main(String[] args) {
        int[] sortedArray = {2,3,4,6,9,13};
        int target1 = 9;
        int target2 = 232;

        System.out.println("Index of " + target1 + ": " + binarySearch(sortedArray, target1));
        System.out.println("Index of " + target2 + ": " + binarySearch(sortedArray, target2));
    }

    public static int binarySearch(int[] nums, int target){
        int low = 0, high = nums.length-1;
        while(low <= high){
            // Prevent potential overflow
            int mid = low + (high-low)/2;

            if(nums[mid] == target) return mid;
            else if(nums[mid] < target){
                // Target is in the right half
                low = mid+1;
            }
            else{
                // Target is in the left half
                high = mid-1;
            }
        }
        // Target not found
        return -1;
    }
}
