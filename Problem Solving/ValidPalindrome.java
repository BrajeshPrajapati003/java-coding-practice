public class ValidPalindrome {
    public static boolean isPalindrome(String str){
        if(str.isEmpty()){
            return true; // Empty string is a palindrome
        }

        int left = 0, right = str.length()-1;
        while(!Character.isLetterOrDigit(str.charAt(left))){
            // Skip non-alphanumeric from left
            left++;
        }

        while(!Character.isLetterOrDigit(str.charAt(right))){
            // Skip non-alphanumeric from right
            right++;
        }

        while(left < right){
            // Case insensitive comparison
            if(!(Character.toLowerCase(str.charAt(left)) == Character.toLowerCase(str.charAt(right)))) return false;
            left++;
            right--;
        }
        
        return true;
    }
    public static void main(String[] args) {
        String str1 = "racecar";
        String str2 = "world";
        System.out.println("\"" + str1 + "\" is a palindrome: " + isPalindrome(str1));
        System.out.println("\"" + str2 + "\" is a palindrome: " + isPalindrome(str2));
    }
}
