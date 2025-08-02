import java.util.Stack;

public class ForEachOnStack {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        st.push("Blue");
        st.push("Pink");
        st.push("Red");
        st.push("Green");
        st.push("Yellow");

        for(String i: st){
            System.out.print(i+" ");
        }
    }
}
