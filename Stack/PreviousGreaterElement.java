import java.util.Stack;

public class PreviousGreaterElement {
    public static int[] pgeUsingStack(int[] arr){
        int n = arr.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();

        // Left to right
        for(int i=0; i<n; i++){
            while(!st.isEmpty() && st.peek() < arr[i]){
                st.pop();
            }
            
            res[i] = st.isEmpty() ? -1: st.peek();

            st.push(arr[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        
    }
}
