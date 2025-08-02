import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
public class ArrayList2Stack {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("43");
        list.add("66");
        list.add("67");
        list.add("71");

        Stack<String> stack = new Stack<>();
        stack.push("70");

        // for(String s: list){
        //     stack.push(s);
        // }

        stack.addAll(list);

        System.out.println(stack);
    }
}
