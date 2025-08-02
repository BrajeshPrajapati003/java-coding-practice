
import java.util.Stack;

public class Stack2Object3 {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        st.push("Blue");
        st.push("Pink");
        st.push("Red");
        st.push("Green");
        st.push("Yellow");

        Object[] arr = st.toArray();
        System.out.println("Stack Elements: "+st);
        System.out.println("Array Elements:");
        for(Object i: arr){
            System.out.print(i + " ");
        }

    }
}
