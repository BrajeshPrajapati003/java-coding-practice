import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheck {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the String: ");
            String str = sc.nextLine();
            boolean isPalindrome = isPalindrome(str);
            System.out.println("Is Palindrome?: " + isPalindrome);
        }
    }

    public static boolean isPalindrome(String str){
        Stack<Character> stack = new Stack<>();
        for(char c: str.toCharArray()){
            stack.push(c);
        }

        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return str.equals(sb.toString());
    }
}
