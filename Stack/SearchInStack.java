import java.util.Stack;

public class SearchInStack {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        st.push("Kashish");
        st.push("Brajesh");
        st.push("Kavita");
        st.push("Shivam");
        st.push("Vijay");

        int foundAt = st.search("Brajesh");
        System.out.println("Element found at: " + foundAt); // 1-based indexing (in LIFO)

    }
}
