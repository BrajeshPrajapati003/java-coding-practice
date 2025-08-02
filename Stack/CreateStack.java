import java.util.Stack;
public class CreateStack{
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(43);
        st.push(66);
        st.push(67);
        st.push(71);

        System.out.println("Stack Elements: " + st);
    }
}