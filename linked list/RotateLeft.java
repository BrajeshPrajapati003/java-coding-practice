public class RotateLeft {
    private Node head;
    private Node tail;
    
    class Node{
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
        tail = newNode;
    }

    void display(){
        if(head == null || head.next == null) return;
        Node curr = this.head;
        while(curr != null){
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    void rotateLeft(int k){
        if(head == null || head.next == null || k == 0) return;

        // Calculate length and find the tail
        Node oldHead = head;
        Node curr = head;
        int length = 1;
        while(curr.next != null){
            curr = curr.next;
            length++;
        }
        Node oldTail = curr;

        // Calculate effective k for left rotation
        k %= length;
        if(k == 0) return;

        // Find the new tail (kth node from original head)
        // and the new head - (k+1)th node from original head
        Node newTail = oldHead;
        for(int i=0; i<k-1; i++){
            newTail = newTail.next;
        }

        // Perform the rotation

        // The node after newTail is the new head
        Node newHead = newTail.next;
        // Connect the original tail to the original head
        oldTail.next = oldHead;
        // Break the link to form the new tail
        newTail.next = null;
        // Update the class's head pointer
        head = newHead;
    }

    public static void main(String[] args) {
        RotateLeft ll = new RotateLeft();
        for(int i=1; i<11; i++) ll.add(i);
        ll.display();

        ll.rotateLeft(4);
        ll.display();
    }
}
