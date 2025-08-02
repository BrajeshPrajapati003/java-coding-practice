import java.util.Stack;

public class Stack2Stack {
    public static void main(String[] args) {
        Stack<String> st1 = new Stack<>();
        st1.push("Blue");
        st1.push("Pink");
        st1.push("Red");
        st1.push("Green");
        st1.push("Yellow");

        Stack<String> st2 = new Stack<>();
        st2.addAll(st1);
        System.out.println(st2);

    }
}
