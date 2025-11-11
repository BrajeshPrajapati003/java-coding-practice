public class NBase2Int {
    static int fromBaseN(String s, int base){
        if(base < 2 || base > 36){
            throw new IllegalArgumentException("Base must be between 2 and 36");
        }

        boolean isNegative = s.startsWith("-"); // startsWith isn't applicable with char
        int start = isNegative ? 1 : 0;
        int res = 0, len = s.length();

        for(int i=start; i<len; i++){
            char c = s.charAt(i);

            int dgt = (c >= '0' && c <= '9') ? c - '0' : Character.toUpperCase(c) - 'A' + 10;

            if(dgt >= base){
                throw new IllegalArgumentException("Invalid digit " + c + " for base " + base);
            }
            res = res * base + dgt;
        }

        return isNegative ? -res : res;
    }

    public static void main(String[] args) {
        // Sample conversions
        System.out.println("Binary 1011 -> " + fromBaseN("1011", 2));   // 11
        System.out.println("Octal 77 -> " + fromBaseN("77", 8));        // 63
        System.out.println("Hex FF -> " + fromBaseN("FF", 16));         // 255
        System.out.println("Base-36 Z -> " + fromBaseN("Z", 36));       // 35
        System.out.println("Base-7 123 -> " + fromBaseN("123", 7));     // 66
        System.out.println("Negative example: -1A (hex) -> " + fromBaseN("-1A", 16)); // -26
    }
}
