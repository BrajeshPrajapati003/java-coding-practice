class LinkedList{
    private Node head;

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }

    void push(int newData){
        Node myNode = new Node(newData);
        myNode.next = head;
        head = myNode;
    }

    void printList(){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    Node KAltReverse(Node node, int k){

        if(k <= 0){
            throw new IllegalArgumentException("k must be a positive integer.");
        }

        if(node == null) return null;

        Node curr = node;
        Node next = null, prev = null;
        int count = 0;

        // 1. Reverse the first k nodes
        while(curr != null && count < k){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }

        // After reversing, 'node' is the new tail of the reversed segment.
        // 'curr' is now the (k+1)th node
        node.next = curr;

        // 2. Skip the next k-1 nodes
        // (k-1 because 'curr' is already the 1st of the skipped block)
        count = 0;
        while(count < k-1 && curr != null){
            // Skip k-1 nodes
            curr = curr.next;
            count++;
        }

        // If there are remaining nodes after skipping, recursively call kAltReverse
        // and connect the current segment's end to the result.
        if(curr != null) curr.next = KAltReverse(curr.next, k);

        // 'prev' is the new head of the reversed segment
        return prev;
    }

    // Getter for head if needed from outside (e.g. for the main method)
    Node getHead(){
        return head;
    }

    // Setter for head if you need to update it from outside
    void setHead(Node newHead){
        this.head = newHead;
    }

}

public class ReverseAlternateKNodes{
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        for(int i=15; i>0; i--){
            list.push(i);
        }

        System.out.println("Given linked list");
        list.printList();

        // Update the head of the LinkedList instance after reversal
        list.setHead(list.KAltReverse(list.getHead(), 4));

        System.out.println("Modified linked list");
        list.printList();

    }
}