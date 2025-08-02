public class RemoveAdjacentDuplicates {
    public static class Node{
        int val;
        Node next;
        public Node(int val){
            this.val = val;
        }
    }

    public static Node removeAdjacentDuplicates(Node head){
        Node curr = head;
        while(curr != null && curr.next != null){
            if(curr.val == curr.next.val){
                curr.next = curr.next.next;
            }else{
                curr = curr.next;
            }
        }
        return head;
    }
    
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(1);
        head.next.next = new Node(2);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(3);
        head.next.next.next.next.next = new Node(4);
        head.next.next.next.next.next.next = new Node(4);
        head.next.next.next.next.next.next.next = new Node(4);
        head.next.next.next.next.next.next.next.next = new Node(1);

        System.out.println("Original List:");
        Node curr = head;
        while(curr != null){
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();

        System.out.println("New List:");
        curr = removeAdjacentDuplicates(head);
        while(curr != null){
            System.out.print(curr.val+" ");
            curr = curr.next;
        }
        System.out.println();
    }
}