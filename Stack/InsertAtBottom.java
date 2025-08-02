import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class InsertAtBottom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st1 = new Stack<>();
        for(int i=0; i<10; i++){
            st1.push(i+1);
        }

        System.out.println("Given Stack: " + st1.toString());
        List<Integer> list = new ArrayList<>();
        while(!st1.isEmpty()){
            list.add(st1.pop());
        }
        
        System.out.println("Specify the position to add new element:");
        int pos = sc.nextInt();
        System.out.println("Enter the new element:");
        st1.push(sc.nextInt());
        for(int i=list.size()-1; i>=0; i--){
            st1.push(list.get(i));
        }
        System.out.println("New Stack: " + st1);
    }
}
