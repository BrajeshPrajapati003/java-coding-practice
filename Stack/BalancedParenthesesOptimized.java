
import java.util.Stack;
import java.util.Map;
import java.util.HashMap;

public class BalancedParenthesesOptimized {
    public static void main(String[] args) {
        String str = "(([{()}]))";
        System.out.println("String: " + str);
        System.out.println("Parentheses are Balanced?: " + isBalanced(str));
    }

    public static boolean isBalanced(String str){
        // Empty string is considered balanced
        if((str == null) || str.isEmpty()) return true;

        Stack<Character> stack = new Stack<>();
        Map<Character, Character> matchingPairs = new HashMap<>();
        matchingPairs.put(')', '(');
        matchingPairs.put('}', '{');
        matchingPairs.put(']', '[');

        for(char ch: str.toCharArray()){
            if(matchingPairs.containsValue(ch)){ // Opening brackets
                stack.push(ch);
            }else if(matchingPairs.containsKey(ch)){ // Closing brackets
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                if(top != matchingPairs.get(ch)){
                    return false; // Mismatched brackets
                }
            }
        }
        return stack.isEmpty(); // Balanced only if stack is empty
    }
}
