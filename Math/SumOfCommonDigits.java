import java.util.HashMap;
import java.util.Scanner;

public class SumOfCommonDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three numbers:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        sc.close();
        
        int sum = sumOfCommonDigits(n1, n2, n3);
        System.out.println(sum);
    }
    
    static int sumOfCommonDigits(int n1, int n2, int n3){
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        
        while(n1 > 0){
            int d = n1 % 10;
            map1.put(d, map1.getOrDefault(d, 0) + 1);
            n1 /= 10;
        }
        
        while(n2 > 0){
            int d = n2 % 10;
            map2.put(d, map2.getOrDefault(d, 0) + 1);
            n2 /= 10;
        }
        
        int sum = 0;
        
        while(n3 > 0){
            int d = n3 % 10;
            if(map1.containsKey(d) && map2.containsKey(d)){
                map1.put(d, map1.get(d) - 1);
                map2.put(d, map2.get(d) - 1);
                if(map1.get(d) == 0) map1.remove(d);
                if(map2.get(d) == 0) map2.remove(d);
                
                sum += d;
            }
            n3 /= 10;
        }
        return sum;
    }
}
