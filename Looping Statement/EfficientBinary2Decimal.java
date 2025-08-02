public class EfficientBinary2Decimal{
    public static int binary2Decimal(String binary){
        int decimal = 0;
        int n = binary.length();

        for (int i = 0; i < n; i++) {
            char digit = binary.charAt(i);

            if(digit != '0' && digit != '1') System.out.println("Invalid binary number");

            // Left shift the current decimal value by 1
            decimal <<= 1;

            // add 1 to the decimal value
            if(digit == '1') decimal |= 1; // Bitwise OR with 1 sets the last bit to 1
        }
        return decimal;
    }

    public static void main(String[] args) {
        String binary = "10101";
        System.out.println("Binary: " + binary);
        System.out.println("Decimal: " + binary2Decimal(binary));
    }
}