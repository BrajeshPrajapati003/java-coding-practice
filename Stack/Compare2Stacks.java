
import java.util.Stack;

public class Compare2Stacks {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        stack1.push(43);
        stack1.push(66);

        stack2.push(67);
        stack2.push(43);
        stack2.push(66);

        if(stack1.equals(stack2)) System.out.println("Stack1 = Stack2");
        else System.out.println("Stack1 != Stack2");

    }
}
