import java.util.Stack;

class MinStack{
    private final Stack<Integer> stack;
    private final Stack<Integer> minStack;

    public MinStack() {
        this.stack = new Stack<>();
        this.minStack = new Stack<>();
    }

    public void push(int value){
        stack.push(value);
        if(minStack.isEmpty() || minStack.peek() > value){
            minStack.push(value);
        }
    }

    public void pop(){
        if(stack.isEmpty()) return;

        int popped = stack.pop();
        if(minStack.peek() == popped) minStack.pop();
    }

    public int getMin(){
        return minStack.peek();
    }

    public int top(){
        return stack.peek();
    }
}

public class MinStackImplementation2 {
    public static void main(String[] args) {
        MinStack stack = new MinStack();
        stack.push(43);
        stack.push(66);
        stack.push(71);
        stack.push(67);
        stack.push(02);

        System.out.println("Minimum element: " + stack.getMin());
        stack.pop();
    }
}
