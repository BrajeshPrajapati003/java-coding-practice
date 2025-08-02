
import java.util.Stack;

public class BalancedParentheses {
    public static void main(String[] args) {
        String str = "(([{()}]))";
        Stack<Character> stack = new Stack<>();

        boolean isBalanced = true;
        for(char ch: str.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '[') stack.push(ch);

            else if(ch == ')' || ch == '}' || ch == ']'){
                if(stack.isEmpty()){
                    isBalanced = false;
                    break;
                }
                char top = stack.pop();
                if(ch == ')' && top != '(' || ch == '}' && top != '{' || ch == ']' && top != '['){
                    isBalanced = false;
                    break;
                }
            }
        }
        System.out.println("Parentheses are Balanced?: " + isBalanced);
    }
}
