import java.util.Stack;

public class RevStackRecursion {

    public static void displayRevRec(Stack<Integer> st){
        if(st.isEmpty()) return;
        int top = st.pop();
        System.out.print(top + " ");
        displayRevRec(st);
        st.push(top);

    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        for(int i=1; i<=10; i++){
            st.push(i);
        }
        displayRevRec(st);
        System.out.println();
        displayRevRec(st);
    }
}
