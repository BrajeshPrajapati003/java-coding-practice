import java.util.Stack;

public class StackSize {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        st.push("Blue");
        st.push("Pink");
        st.push("Red");
        st.push("Green");
        st.push("Yellow");

        System.out.println("Size of the Stack: " + st.size());
    }
}
