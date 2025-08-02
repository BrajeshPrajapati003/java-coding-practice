public class CheckPalindrome2 {
    public static void main(String[] args) {
        String str = "kavita";
        System.out.println("Is string palindrome? : "+ isPalindrome(str));
    }

    public static boolean isPalindrome(String str){
        StringBuilder sb = new StringBuilder(str);
        String str2 = sb.reverse().toString();
        for(int i=str.length()-1; i>=0; i--){
            if(str.charAt(i) != str2.charAt(i)) return false;
        }
        return true;
    }
}