public class Binary2Decimal {
    public static int binaryToDecimal(String binary){
        int decimal = 0, power = 0;

        for(int i=binary.length()-1; i>=0; i--){
            char digit = binary.charAt(i);

            if(digit != '0' && digit != '1') {
                throw new IllegalArgumentException("Invalid binary string: " + binary);
            }

            if(digit == '1'){
                decimal += Math.pow(2, power);
            }
            power++;
        }
        return decimal;
    }
    public static void main(String[] args) {
        String biNum = "101101";
        System.out.println("Binary: " + biNum + ", Decimal: " + binaryToDecimal(biNum));

        try {
            String invalidBinary = "10201";
            System.out.println("Binary: " + invalidBinary + ", Decimal: " + binaryToDecimal(invalidBinary));
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
