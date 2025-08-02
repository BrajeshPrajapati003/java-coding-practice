public class DeleteNNodes {
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
        this.tail = newNode;
    }
    
    void deleteNNodes(int after, int nodes){
        if(nodes < 0) return;
        if(after < 0) return;

        if(after == 0){
            Node newHead = this.head;
            for(int i=0; i<nodes && newHead != null; i++){
                newHead = newHead.next;
            }
            this.head = newHead;

            if(this.head == null) this.tail = null;
            else if(this.head.next == null && nodes > 0){
                // This case is complex depending on exact scenario
            }
            return;
        }

        Node curr = this.head;
        for(int i=1; i<after-1 && curr != null; i++){
            curr = curr.next;
        }

        if(curr == null) return;
        Node temp = curr.next;
        for(int i=1; i<=nodes && temp != null; i++){
            temp = temp.next;
        }
        if(curr.next == null) this.tail = curr;
    }

    void display(){
        Node curr = this.head;
        while(curr != null){
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        DeleteNNodes ll = new DeleteNNodes();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.add(6);
        ll.add(7);
        ll.add(8);
        ll.display();

        ll.deleteNNodes(0, 4);
        ll.display();
        System.out.println(ll.head.val);
        System.out.println(ll.tail.val);
    }

}
