class Node{
    int val;
    Node next;

    public Node(){}

    public Node(int val){
        this.val = val;
    }

    public static void split_PrintEvenOdd(Node head){
        Node curr = head;
        Node evenHead = new Node();
        Node oddHead = new Node();
        Node even = evenHead;
        Node odd = oddHead;

        while(curr != null){
            if(curr.val % 2 == 0){
                even.next = curr;
                even = even.next;
            }else{
                odd.next = curr;
                odd = odd.next;
            }
            curr = curr.next;
        }
        even.next = null;
        odd.next = null;

        System.out.println("Even List:");
        even = evenHead.next;
        odd = oddHead.next;

        while(even != null){
            System.out.print(even.val + " ");
            even = even.next;
        }
        System.out.println();

        System.out.println("Odd List:");
        while(odd != null){
            System.out.print(odd.val + " ");
            odd = odd.next;
        }
        System.out.println();
    }
}

public class SplitEvenOdd{
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

        Node.split_PrintEvenOdd(head);
    }
}