
import java.util.Stack;

public class ReverseString2 {
    public static void main(String[] args) {
        String str = "Brajesh Prajapati";
        Stack<Character> st = new Stack<>();
        System.out.println("Original String: " + str);

        for(char ch: str.toCharArray()){
            st.push(ch);
        }

        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }

        System.out.println("Reversed String: " + sb);
    }
}
