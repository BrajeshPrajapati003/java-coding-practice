
import java.util.LinkedList;
import java.util.Queue;

class MyStack{

    private final Queue<Integer> que;

    public MyStack() {
        que = new LinkedList<>();
    }

    public void push(int value){
        que.add(value);
        int size = que.size();
        while(size>1){
            que.add(que.remove());
            size--;
        }
    }
    
    public int pop(){
        return que.remove();
    }

    public int top(){
        return que.peek();
    }

    public boolean isEmpty(){
        return que.isEmpty();
    }
}

public class StackUsingQ {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(43);
        stack.push(66);
        stack.push(67);
        stack.push(71);

        System.out.println(stack);
    }
}
