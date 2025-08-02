public class NthNodeFromEnd {
    public static Node nthNode(Node head, int n){
        int size = 0;
        Node curr = head;
        while(curr != null){
            curr = curr.next;
            size++;
        }
        int m = size-n + 1;

        // mth node from start = nth node from end
        curr = head;

        for(int i=0; i<m-1; i++){
            curr = curr.next;
        }
        return curr;
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

        // Get 3rd node from last
        Node temp = nthNode(a, 3);
        System.out.println(temp.data);
    }
}
