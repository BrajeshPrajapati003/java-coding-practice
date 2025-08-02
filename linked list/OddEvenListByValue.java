public class OddEvenListByValue {

    public static class Node{
        int val;
        Node next;
        Node(){}
        Node(int val){
            this.val = val;
        }
    }

    public static Node oddEvenList(Node head){
        if(head == null || head.next == null) return head;
        Node curr = head;
        Node evenHead = new Node();
        Node oddHead = new Node();
        Node evenTail = evenHead;
        Node oddTail = oddHead;

        while(curr != null){
            if(curr.val % 2 == 0){
                evenTail.next = curr;
                evenTail = evenTail.next;
            }else{
                oddTail.next = curr;
                oddTail = oddTail.next;
            }
            curr = curr.next;
        }

        evenTail.next = null;
        oddTail.next = null;

        oddTail.next = evenHead.next;

        return oddHead.next;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);

        System.out.println("Original List:");
        Node curr = head;
        while(curr != null){
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();

        Node newList = oddEvenList(head);
        System.out.println("Resultant List:");
        while(newList != null){
            System.out.print(newList.val + " ");
            newList = newList.next;

        }
    }
}
