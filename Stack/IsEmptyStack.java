
import java.util.Stack;

public class IsEmptyStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(43);
        st.push(66);
        st.push(67);
        st.push(71);

        System.out.println("Is Stack empty: " + st.isEmpty()); // false
        st.clear();
        System.out.println("Is Stack empty: " + st.isEmpty()); // true
    }
}
