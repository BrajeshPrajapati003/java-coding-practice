
import java.util.Stack;

class MinStack{
    private final Stack<Integer> stack;
    private final Stack<Integer> minStack;

    public MinStack(){
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int value){
        stack.push(value);
        if(minStack.isEmpty() || value <= minStack.peek()){
            minStack.push(value);
        }
    }

    public void pop(){
        if(stack.isEmpty()) return;

        int popped = stack.pop();
        if(popped == minStack.peek()){
            minStack.pop();
        }
    }

    public int top(){
        return stack.peek();
    }

    public int getMin(){
        return minStack.peek();
    }
}

public class MinStackImplementation {
    public static void main(String[] args) {
        MinStack stack = new MinStack();
        stack.push(43);
        stack.push(66);
        stack.push(71);
        stack.push(67);
        stack.push(02);

        System.out.println("Minimum Element: " + stack.getMin());
        stack.pop();
    }
}
