public class BasicLL{
    public static class Node{
        int data; // Value
        Node next; // Address of the next node

        Node(int data){
            this.data = data;
        }

        public static void display(Node head){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }

        public static void displayRecursive(Node head){
            if(head == null) return;
            System.out.print(head.data + " ");
            displayRecursive(head.next);
        }

        public static void displayReverse(Node head){
            if(head == null) return;
            displayReverse(head.next);
            System.out.print(head.data + " ");
        }
        
        public static int findLength(Node head){
            int len = 0;
            while(head != null){
                len++;
                head = head.next;
            }
            return len;
        }

        public static int findLengthRecursive(Node head){
            if(head == null) return 0;
            return findLengthRecursive(head.next) + 1;
        }

        public static void insertAtEnd(Node head, int data){
            Node curr = head;
            Node temp = new Node(data);
            while(curr.next != null){
                curr = curr.next;
            }
            curr.next = temp;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(6);
        Node c = new Node(7);
        Node d = new Node(8);
        // 5 -> 6 -> 7 -> 8

        a.next = b;
        b.next = c;
        c.next = d;

        // System.out.println(a.data);
        // System.out.println(b.data);
        // System.out.println(a.next.next.data);
        // System.out.println(b.next.next.data);

        Node.display(a);
        System.out.println();

        Node.displayRecursive(a);
        System.out.println();

        Node.displayReverse(a);
        System.out.println();

        System.out.println("Size using iteration:");
        System.out.println(Node.findLength(a));
        System.out.println(Node.findLength(a));

        System.out.println("Size using Recursion:");
        System.out.println(Node.findLengthRecursive(a));
        System.out.println(Node.findLengthRecursive(a));

        Node.insertAtEnd(a, 43);
        Node.insertAtEnd(a, 66);
        Node.insertAtEnd(c, 67);
        Node.display(a);

    }
}