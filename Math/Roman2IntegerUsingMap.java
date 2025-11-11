
import java.util.*;

public class Roman2IntegerUsingMap{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        String roman = sc.nextLine();
        System.out.println("Integer: " + roman2Integer(roman));
        }
    }

    static int roman2Integer(String s){
        // Map Roman symbols to values
        Map<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int n = s.length();
        int res = 0;

        for(int i=0; i<n; i++){
            int value = map.get(s.charAt(i));

            // If next value is bigger, subtract instead of add
            if(i+1 < n && value < map.get(s.charAt(i+1))){
                res -= value;
            }else{
                res += value;
            }
        }
        return res;
    }
}