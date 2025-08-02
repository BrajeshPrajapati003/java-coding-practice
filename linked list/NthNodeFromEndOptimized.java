public class NthNodeFromEndOptimized {

    public static int nthNode(Node head, int n){
        Node fast = head;
        Node slow = head;
        for(int i=0; i<n; i++){
            fast = fast.next;
        }

        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow.data;
    }

    public static class Node{
        int data;
        Node next;
        public Node(int data){
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

        // 3rd last element in one traversal only
        System.out.println(nthNode(a, 1));
    }
}
