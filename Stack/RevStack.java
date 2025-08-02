
import java.util.Stack;

public class RevStack {
    public static void pushAtBottom(Stack<Integer> st, int x){
        if(st.isEmpty()){
            st.push(x);
            return;
        }
        int top = st.pop();
        pushAtBottom(st, x);
        st.push(top);

    }

    public static void revStack(Stack<Integer> st){
        if(st.size() == 1) return;
        int top = st.pop();
        revStack(st);
        pushAtBottom(st, top);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        for(int i=1; i<=8; i++) st.push(i);
        System.out.println("Original Stack: " + st);
        revStack(st);
        System.out.println("Reversed Stack: " + st);
    }
}
