public class RemoveNthNodeFromEnd {

    public static Node nthNodeFromEnd(Node head, int n){
        Node fast = head;
        Node slow = head;

        for(int i=0; i<n; i++){
            fast = fast.next;
        }

        // if fast == null -> n == size of the list
        // null doesn't have next field (NullPointerException)
        // if(n == size) we are asked to remove the fist element

        if(fast == null){
            head = head.next;
            return head;
        }

        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    public static void display(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(6);
        Node c = new Node(7);
        Node d = new Node(8);
        Node e = new Node(9);
        Node f = new Node(10);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        display(a);
        a = nthNodeFromEnd(a, 4);
        display(a);
    }
}