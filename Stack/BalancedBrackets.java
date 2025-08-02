import java.util.Scanner;

public class BalancedBrackets {

    static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
            next = null;
        }
    }

    static class Stack{
        private Node head;
        private int size = 0;

        void push(int val){
            Node n = new Node(val);
            n.next = head;
            head = n;
            size++;
        }

        int pop(){
            if(head == null){
                System.out.println("Stack is empty! can't perform pop()");
                return -1;
            }

            size--;
            Node n = head;
            head = head.next;
            return n.val;
        }

        int peek(){
            return head.val;
        }

        int size(){
            return size;
        }

        void displayRec(Node h){
            if(h == null) return;
            displayRec(h.next);
            System.out.print(h.val + " ");
        }
        void display(){
            displayRec(head);
            System.out.println();
        }
    }

    public static boolean balancedBrackets(String str){
        Stack st = new Stack();
        int len = str.length();
        if((len & 1) == 1) return false;

        for (int i = 0; i < len; i++) {
            char c = str.charAt(i);
            if(c == '(' || c == '{' || c == '[') st.push(c);
            else{
                if(st.size() == 0) return false;
                else if(c == ')' && st.peek() == '(') st.pop();
                else if(c == '}' && st.peek() == '{') st.pop();
                else if(c == ']' && st.peek() == '[') st.pop();
                else return false; 
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        System.out.println("Are brackets balanced? : " + balancedBrackets(str));
    }
}