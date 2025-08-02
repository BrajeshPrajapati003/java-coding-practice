public class SumDigitsString {

    public static int sumDigits(String s){
        int sum = 0;
        for(int i=0; i<s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                String temp = s.substring(i, i+1);
                sum += Integer.parseInt(temp);
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        String str = "officialTyrant003";
        System.out.println("String Digit sum: "+sumDigits(str));
    }
}