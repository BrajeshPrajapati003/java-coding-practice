public class FindMissingNumber {

    public static int findMissingNum(int[] nums){

        // Since one number is missing, the total number of elements in the complete series would be "arr.length + 1"
        int n = nums.length+1;
        int expectedSum = ( n*(n+1) )/2;
        int actualSum = 0;

        for(int i: nums){
            actualSum += i;
        }
        return expectedSum-actualSum;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,6,7,8,9,10};
        int missingNumber = findMissingNum(nums);
        System.out.println(missingNumber);// 5
    }
}