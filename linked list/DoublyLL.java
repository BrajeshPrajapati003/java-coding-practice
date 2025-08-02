public class DoublyLL {
    public static class Node{
        int val;
        Node next;
        Node prev;
        public Node(int val){
            this.val = val;
        }
    }

    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void displayReverse(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr. val + " ");
            curr = curr.prev;
        }
        System.out.println();
    }

    public static void display2(Node random){
        Node temp = random;
        while(temp.prev != null){
            temp = temp.prev;
        }
        Node curr = temp;
        while(curr != null){
            System.out.print(curr.val+" ");
            curr = curr.next;
        }
    }

    public static Node insertAtHead(Node head, int val){
        Node temp = new Node(val);
        temp.next = head;
        head.prev = temp;
        return temp;
    }

    public static Node insertAtEnd(Node head, int val){
        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        Node temp = new Node(val);
        curr.next = temp;
        temp.prev = curr;
        return head;
    }

    public static Node insertAtIdx(Node head, int val, int idx){
        Node curr = head;
        for(int i=0; i<idx-1; i++){
            curr = curr.next;
        }
        Node temp = new Node(val);
        temp.prev = curr;
        temp.next = curr.next;
        curr.next = temp;
        return head;
    }

    public static Node deleteAtHead(Node head){
        head = head.next;
        head.prev = null;
        return head;
    }

    public static Node deleteAtLast(Node head){
        Node curr = head;
        while(curr.next.next != null){
            curr = curr.next;
        }
        curr.next = null;
        return head;
    }

    public static Node deleteAtIdx(Node head, int idx){
        Node curr = head;
        for(int i=0; i<idx-1; i++){
            curr = curr.next;
        }
        curr.next = curr.next.next;
        curr.next.prev = curr;
        return head;
    }

    public static void main(String[] args) {
        Node a = new Node(66);
        Node b = new Node(43);
        Node c = new Node(67);
        a.prev = null;
        a.next = b;
        b.next = c;
        b.prev = a;
        c.prev = b;
        c.next = null;

        display(a);
        displayReverse(c);
        display2(b);
        System.out.println();
        Node curr = insertAtHead(a, 70);
        display(curr);
        System.out.println();

        Node curr2 = insertAtEnd(a, 71);
        display(curr2);

        Node curr3 = insertAtIdx(a, 66, 3);
        display(curr3);

    }
}
