import java.util.Stack;

class Node{
    Node next;
    int data;

    Node(int data){
        this.data = data;
        next = null;
    }
}

public class CheckPalindrome {
    static boolean isPalindrome(Node head){
        Node curr = head;
        Stack<Integer> st = new Stack<>();
        
        while(curr != null){
            st.push(curr.data);
            curr = curr.next;
        }

        curr = head;
        while(curr != null){
            if(st.pop() != curr.data) return false;
            curr = curr.next;
        }
        return true;
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(3);
        Node e = new Node(2);
        Node f = new Node(1);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = null;

        System.out.println("Is Palindrome: " + isPalindrome(a));
    }
}
