public class Binary2Decimal {
    public static int binaryToDecimal(String binary){
        int decimal = 0;
        for(char digit: binary.toCharArray()){
            if(digit != '1' && digit != '0'){
                throw new IllegalArgumentException("Invalid Binary Number!");
            }

            decimal *= 2;
            if(digit == '1') decimal += 1;
        }
        return decimal;
    }
    public static void main(String[] args) {
        String binary = "11010";
        System.out.println("Binary: " + binary);
        System.out.println("Decimal: " + binaryToDecimal(binary));
    }
}
