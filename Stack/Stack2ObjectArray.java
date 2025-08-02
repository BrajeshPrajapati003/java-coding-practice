
import java.util.Stack;

public class Stack2ObjectArray {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Orange");
        stack.push("Grapes");

        Object[] arr = new Object[stack.size()];
        for (int i=0; i<stack.size(); i++) {
            arr[i] = stack.pop();
        }

        // As the stack size is changing with the loop hence the array will not have all elements of the stack
        
        for(Object i: arr){
            System.out.print(i+" "); // Grapes Orange null null 
        }
    }
}
