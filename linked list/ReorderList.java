public class ReorderList {
    private Node head;
    private Node tail;

    static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }

    void add(int val){
        Node newNode = new Node(val);
        if(head == null){
            this.head = newNode;
            this.tail = newNode;
            return;
        }
        
        this.tail.next = newNode;
        this.tail = newNode;
    }

    void printList(){
        Node curr = this.head;
        while(curr != null){
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    } 

    void reorderList(){
        if(this.head == null || this.head.next == null || this.head.next.next == null) return;

        Node slow = this.head, fast = this.head;

        // find the middle element
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node c2 = slow.next;
        Node prev = null;
        slow.next = null;

        // reverse the second half of the list
        while (c2 != null) { 
            Node temp = c2.next;
            c2.next = prev;
            prev = c2;
            c2 = temp;
        }

        Node c1 = this.head;
        c2 = prev;
        while(c2 != null){
            Node t1 = c1.next;
            Node t2 = c2.next;

            c1.next = c2;
            c2.next = t1;

            c1 = t1;
            c2 = t2;
        }
    }

    public static void main(String[] args) {
        ReorderList ll = new ReorderList();
        for(int i=1; i<11; i++){
            ll.add(i);
        }
        ll.printList();

        ll.reorderList();
        ll.printList();
    }
}
