import java.util.Stack;

public class CopyStack {
    public static void main(String[] args) {
        Stack<Integer> st1 = new Stack<>();
        for(int i=1; i<=10; i++){
            st1.push(i);
        }

        Stack<Integer> st2 = new Stack<>();
        while(!st1.isEmpty()){
            st2.push(st1.pop());
        }

        Stack<Integer> st3 = new Stack<>();
        while(!st2.isEmpty()){
            int item = st2.pop();
            st3.push(item);
            st1.push(item);
        }

        System.out.println("Original Stack: " + st1.toString());
        System.out.println("Copied Stack: " + st3.toString());


    }
}
