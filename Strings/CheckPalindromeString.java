public class CheckPalindromeString {
    public static void main(String[] args) {
        System.out.println(Palindrome.checkPalindrome("saaasaaas"));
    }
}

class Palindrome{
    public static boolean checkPalindrome(String str){
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String rev = sb.toString();
        return str.equals(rev);
    }
}