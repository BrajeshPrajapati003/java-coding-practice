import java.util.Stack;
public class HybridItemStack {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push("Brajesh");
        st.push("Kashish");
        st.push(43);
        st.push(66);

        System.out.println("Hybrid Stack Elements: " + st);
    }
}
