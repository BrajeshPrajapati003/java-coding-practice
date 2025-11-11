public class Decimal2NBase {
    static String toBaseN(int num, int base){
        if(base < 2 || base > 36){
            throw  new IllegalArgumentException("Base must be between 2 and 36");
        }

        if(num == 0) return "0";

        StringBuilder sb = new StringBuilder();
        boolean isNegative = num < 0;
        num = Math.abs(num);

        while(num > 0){
            int rem = num % base;
            // If remainder >= 10, map to letters A, B, C...
            char dgt = (char) (rem < 10 ? '0' + rem : 'A' + (rem - 10));
            sb.append(dgt);
            num /= base;
        }
        if(isNegative) sb.append('-');
        
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        int num = 255;
        System.out.println("Decimal: " + num);
        System.out.println("Binary: " + toBaseN(num, 2));
        System.out.println("Octal: " + toBaseN(num, 8));
        System.out.println("Hexadecimal " + toBaseN(num, 16));
        System.out.println("Base 36: " + toBaseN(num, 36));
    }
}
