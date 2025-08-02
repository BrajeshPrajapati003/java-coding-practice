interface StringChecker{
    boolean check(String str);
}
public class Palindrome {
    public static void main(String[] args) {
        StringChecker isPalindromeLambda = str -> {
            String cleanedStr = str.replaceAll("\\s", " ").toLowerCase();
            return cleanedStr.equals(new StringBuilder(cleanedStr).reverse().toString());
        };
        System.out.println("Rotator is Palindrome: " + isPalindromeLambda.check("Rotator"));
        System.out.println("World is Palindrome: " + isPalindromeLambda.check("World"));
    }
}
