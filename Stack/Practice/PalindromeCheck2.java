import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheck2 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter a string:");
            String str = sc.nextLine();
            System.out.println("Is Palindrome?: " + isPalindrome(str));
        }        
    }

    public static boolean isPalindrome(String str){
        Stack<Character> stack = new Stack<>();
        for(char ch: str.toCharArray()) stack.push(ch);

        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()) sb.append(stack.pop());

        return str.equals(sb.toString());
    }
}
