import java.util.Stack;

class ListNode{
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
    }
}

public class ReverseLinkedListUsingStack {
    public static void main(String[] args) {
        ListNode head = new ListNode(10);
        head.next = new ListNode(20);
        head.next.next = new ListNode(30);
        head.next.next.next = new ListNode(40);
        head.next.next.next.next = new ListNode(43);
        head.next.next.next.next.next = new ListNode(66);

        ListNode reversed = reverseList(head);
        printLinkedList(reversed);
    }

    // ! Warning: Exporting non-public type through public API
    // ? ListNode -> package private, reverseList() and printLinkedList() -> public

    public static ListNode reverseList(ListNode head){
        if(head == null || head.next == null) return head;

        Stack<ListNode> stack = new Stack<>();
        
        while(head != null){
            stack.push(head);
            head = head.next;
        }

        ListNode newHead = stack.pop();
        ListNode current = newHead;

        while(!stack.isEmpty()){
            current.next = stack.pop();
            current = current.next;
        }

        current.next = null;
        return newHead;
    }

    public static void printLinkedList(ListNode head){
        ListNode current = head;
        while(current != null){
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}