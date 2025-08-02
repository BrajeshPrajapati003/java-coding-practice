
import java.util.Stack;

public class Stack2ObjectArray2 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("Apple");
        stack.push("Banana");
        stack.push("Orange");
        stack.push("Grape");

        Object[] arr = new Object[stack.size()];
        int size = stack.size();
        for(int i=size-1; i>=0; i--){
            arr[i] = stack.pop();
        }

        for(Object i: arr){
            System.out.print(i+ " ");
        }
    }
}
