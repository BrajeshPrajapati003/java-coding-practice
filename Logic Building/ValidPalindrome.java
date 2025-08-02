public class ValidPalindrome {
    public static void main(String[] args) {
        String s1 = "Racecar";
        String s2 = "A man, a plan, a canal: Panama";
        String s3 = "hello";
        
        System.out.println("\"" + s1 + "\" is a palindrome: " + isPalindrome(s1));
        System.out.println("\"" + s2 + "\" is a palindrome: " + isPalindrome(s2));
        System.out.println("\"" + s3 + "\" is a palindrome: " + isPalindrome(s3));
    }

    public static boolean isPalindrome(String s){
        if(s.isEmpty()) return true;

        int left = 0, right = s.length()-1;
        
        while(left < right){
            // Skip non-alphanumeric characters from the left
            while(left < right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            // Skip non-alphanumeric characters from right
            while(left < right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }

            // Compare characters (case-insensitive)
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }

            left++;
            right--;
        }
        // All valid characters matched
        return true;
    }
}
