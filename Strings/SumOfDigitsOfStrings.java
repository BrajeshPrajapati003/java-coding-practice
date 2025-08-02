public class SumOfDigitsOfStrings {
    public static void main(String[] args) {
        String s = "Brajesh Prajapati123456";
        System.out.println("Sum: "+ sumDigits(s));

    }

    public static int sumDigits(String s){
        int n = s.length();
        int sum = 0;
        for(int i = 0; i<n; i++){
            if(Character.isDigit(s.charAt(i))){
                String temp = s.substring(i, i+1);
                sum += Integer.parseInt(temp);
            }
        }
        return sum;
    }
    
}
