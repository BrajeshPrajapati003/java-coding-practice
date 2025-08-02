import java.util.HashSet;

public class CountAbsolute {
    public static void main(String[] args) {
        int[] nums = new int[]{-1,-1,10,2,2,3,-41,1,5,9};
        int count = 0;
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<nums.length; i++){
            int n = Math.abs(nums[i]);
            if(!set.contains(n)){
                set.add(n);
                count++;
            }
        }
        System.out.println(count);
    }
}
