import java.util.Stack;

class ListNode{
    int value;
    ListNode next;

    public ListNode(int value){
        this.value = value;
    }
}

public class ReverseLLUsingStack {
    public static void main(String[] args) {
        ListNode head = new ListNode(43);
        head.next = new ListNode(66);
        head.next.next = new ListNode(67);
        head.next.next.next = new ListNode(71);

        ListNode reverseHead = reverseList(head);
        printReversedLL(reverseHead);
    }

    public static ListNode reverseList(ListNode head){
        if(head == null || head.next == null) return head;

        Stack<ListNode> stack = new Stack<>();

        while(head != null){
            stack.push(head);
            head = head.next;
        }
        ListNode newHead = stack.pop();
        ListNode curr = newHead;

        while(!stack.isEmpty()){
            curr.next = stack.pop();
            curr = curr.next;
        }
        curr.next = null;

        return newHead;
    }

    public static void printReversedLL(ListNode head){
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.value + " ");
            curr = curr.next;
        }
    }
}
