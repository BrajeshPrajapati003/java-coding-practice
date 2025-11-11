
import java.util.Scanner;

public class Integer2RomanWithoutMap {

    static String int2Roman(int num){
        // Values and corresponding Roman numerals
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder sb = new StringBuilder();

        // Greedy algo: subtract largest value possible
        for(int i=0; i<values.length; i++){
            while(num >= values[i]){
                num -= values[i];
                sb.append(symbols[i]);
            }
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int num = sc.nextInt();
            System.out.println("Roman: " + int2Roman(num));
        }
    }
}
