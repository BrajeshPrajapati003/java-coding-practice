public class DeleteLL {
    public static class Node{
        int val;
        Node next;
        public Node(int val){
            this.val = val;
        }
    }

    public static Node deleteLL(Node head){
        head = null;
        return head;
    }

    public static void displayList(Node head){
        while(head != null){
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;
        displayList(a);
        Node newNode = deleteLL(b);
        System.out.println("List deleted...");
        displayList(newNode);
    }
}
