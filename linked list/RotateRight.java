public class RotateRight {
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
        if(this.head == null){
            this.head = newNode;
            this.tail = newNode;
            return;
        }

        this.tail.next = newNode;
        tail = newNode;
    }

    void display(){
        Node curr = this.head;
        while(curr != null){
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    void rotateRight(int k){
        if(this.head == null || this.head.next == null || k == 0) return;

        Node curr = head;
        int length = 1;
        while(curr.next != null){
            length++;
            curr = curr.next;
        }

        tail = curr;

        k %= length;
        if(k == 0) return;

        // Form a cycle
        tail.next = head;

        Node newTail = head;
        for(int i=0; i<length-k-1; i++){
            newTail = newTail.next;
        }

        head = newTail.next;
        newTail.next = null;
    }

    public static void main(String[] args) {
        RotateRight ll = new RotateRight();
        for(int i=1; i<11; i++) ll.add(i);
        ll.display();

        ll.rotateRight(3);
        ll.display();
    }
}
