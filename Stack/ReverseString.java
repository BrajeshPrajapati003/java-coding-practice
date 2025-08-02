import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Brajesh prajapati";
        Stack<Character> st = new Stack<>();
        for(int i=0; i<str.length(); i++){
            st.push(str.charAt(i));
        }

        for(int i=0; i<str.length(); i++){
            System.out.print(st.pop() + " ");
        }
    }
}
