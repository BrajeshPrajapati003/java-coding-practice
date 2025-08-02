
import java.util.Scanner;

public class MinNum2BalanceBraces {
    static class Node{
        char val;
        Node next;
        Node(char val){
            this.val = val;
            this.next = null;
        }
    }

    static class Stack{
        private Node head;
        private int size = 0;

        void push(char val){
            Node n = new Node(val);
            n.next = head;
            head = n;
            size++;
        }

        char pop(){
            if(head == null){
                System.out.println("Stack is empty!");
                return 0;
            }

            Node n = head;
            head = head.next;
            size--;
            return n.val;
        }

        char peek(){
            if(head == null){
                System.out.println("Stack is empty!");
                return 0;
            }
            
            return head.val;
        }

        void displayHelper(Node h){
            if(h == null) return;
            displayHelper(h.next);
            System.out.print(h.val + " ");
        }

        void display(){
            displayHelper(head);
            System.out.println();
        }

        boolean isEmpty(){
            return size == 0;
        }
    }

    public static int minNum2Balance(String str){
        Stack st = new Stack();
        int len = str.length();
        int count = 0;

        for(int i=0; i<len; i++){
            char c = str.charAt(i);
            if(c == '(' || c == '{' || c == '[') st.push(c);
            else{
                if(st.isEmpty()) count++;
                else{
                    char top = st.peek();
                    if((c == ')' && top == '(') || (c == '}' && top == '{') || (c == ']' && top == '[')) st.pop();
                    else count++;
                }
            }
        }

        return count + st.size;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        int operations = minNum2Balance(str);
        System.out.println("Minimum number of operations to balance the brackets: " + operations);
    }
}
