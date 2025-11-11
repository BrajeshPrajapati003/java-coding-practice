import java.util.Scanner;

public class Roman2IntegerWithoutmap {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in);){
            String s = sc.nextLine();
            System.out.println("Integer value: " + roman2Integer(s));
        }

    }

    static int roman2Integer(String s){
        int len = s.length();
        int res = 0;

        for(int i=0; i<len; i++){
            int curr = val(s.charAt(i));
            if(i+1 < len && curr < val(s.charAt(i+1)))
                res -= curr;
            else
                res += curr;
        }
        return res;
    }

    private static int val(char c){
        return switch(c){
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> throw new IllegalArgumentException("Invalid roman numeral: " + c);
        };
    }
}
