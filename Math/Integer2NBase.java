public class Integer2NBase {

    // Convert a decimal number to base-N string
    public static String toBaseN(int number, int base) {
        if (base < 2 || base > 36) {
            throw new IllegalArgumentException("Base must be between 2 and 36");
        }

        if (number == 0) return "0";

        StringBuilder sb = new StringBuilder();
        boolean isNegative = number < 0;
        number = Math.abs(number);

        while (number > 0) {
            int remainder = number % base;
            // If remainder >= 10, map to letters A, B, C...
            char digit = (char) (remainder < 10 ? '0' + remainder : 'A' + (remainder - 10));
            sb.append(digit);
            number /= base;
        }

        if (isNegative) sb.append('-');

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        int number = 255;

        System.out.println("Decimal: " + number);
        System.out.println("Binary (base 2): " + toBaseN(number, 2));
        System.out.println("Octal (base 8): " + toBaseN(number, 8));
        System.out.println("Hexadecimal (base 16): " + toBaseN(number, 16));
        System.out.println("Base 36: " + toBaseN(number, 36));
    }
}
