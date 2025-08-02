import java.util.Stack;

class MaxStack{
    private final Stack<Integer> stack;
    private final Stack<Integer> maxStack;

    public MaxStack(){
        stack = new Stack<>();
        maxStack = new Stack<>();
    }

    public void push(int value){
        stack.push(value);
        if(maxStack.isEmpty() || value >= maxStack.peek()){
            maxStack.push(value);
        }
    }

    public int pop(){
        if(stack.isEmpty()){
            throw new IllegalStateException("Stack is Empty");
        }
        int popped = stack.pop();
        if(popped == maxStack.peek()) maxStack.pop();
        return popped;
    }

    public int getMax(){
        if(maxStack.isEmpty()){
            throw new IllegalStateException("Stack is Empty");
        }
        return maxStack.peek();
    }

}
public class MaxElemInStack {
    public static void main(String[] args) {
        MaxStack stack = new MaxStack();
        stack.push(43);
        stack.push(66);
        stack.push(67);
        stack.push(71);

        int maxElem = stack.getMax();
        System.out.println("Maximum element is stack: " + maxElem);
    }
}
