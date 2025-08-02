
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class FirstNonRepeatingElement {

    public static int findFirstNonRepeating(int[] nums){
    Queue<Integer> q = new LinkedList<>();
    Map<Integer, Integer> frequencyMap = new HashMap<>();

    for(int num: nums){
        frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        q.offer(num);
    }

    while(!q.isEmpty()){
        int num = q.poll();
        if(frequencyMap.get(num) == 1) return num;
    }
    
    return -1; // If no repeating element found
    }
    
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 4, 5, 1};
        int result = findFirstNonRepeating(nums);
        System.out.println("First Non-repeating Element: " + result);
    }
}
