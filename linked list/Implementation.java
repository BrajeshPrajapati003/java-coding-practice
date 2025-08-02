public class Implementation {

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
        }
    }

    public static class LinkedList{
        private Node head = null;
        private Node tail = null;
        private int size = 0;

        void insertAtEnd(int data){
            Node curr = new Node(data);
            if(head == null) head = curr;
            else tail.next = curr;
            tail = curr;
            size++;
        }

        void insertAtStart(int data){
            Node curr = new Node(data);
            if(head == null){
                head = curr;
                tail = curr;
                // head = tail = curr;
            }else{
                curr.next = head;
                head = curr;
            }
            size++;
        }

        void insertAt(int idx, int data){
            Node temp = new Node(data);
            Node curr = head;

            if(idx == size()){
                insertAtEnd(data);
                return;
            }

            else if(idx == 0){
                insertAtStart(data);
                return;
            }

            else if(idx > size() || idx < 0){
                System.out.println("Invalid index");
            }

            for(int i=0; i<idx-1; i++){
                curr = curr.next;
            }
            temp.next = curr.next;
            curr.next = temp;
            size++;
        }

        int getAt(int idx){
            Node curr = head;

            if(idx > size() || idx < 0){
                System.out.println("Invalid index");
                return -1;
            }

            for(int i=0; i<idx; i++){
                curr = curr.next;
            }
            return curr.data;
        }

        void deleteAt(int idx){
            if(idx == 0){
                head = head.next;
                size--;
                return;
            }
            Node curr = head;

            for(int i=0; i<idx-1; i++){
                curr = curr.next;
            }
            curr.next = curr.next.next;
            if(idx == size-1) tail = curr;
            size--;
        }

        int size(){ // O(n) -> if only head is given
            int count = 0;
            Node curr = head;
            while(curr != null){
                curr = curr.next;
                count++;
            }
            return count;
        }

        void display(){
            Node curr = head;
            while(curr != null){
                System.out.print(curr.data + " ");
                curr = curr.next;
            }
            System.out.println();
        }

    }


    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAtEnd(1);
        ll.insertAtEnd(3);
        ll.insertAtEnd(5);
        ll.insertAtEnd(6);
        ll.insertAtEnd(7);

        // ll.display();

        // System.out.println(ll.size());

        // ll.insertAtStart(0);
        // ll.display();

        // ll.insertAt(6, 9);
        // ll.display();
        // System.out.println(ll.head.data);
        // System.out.println(ll.tail.data);

        // ll.insertAt(0, 100);
        // ll.display();
        // System.out.println(ll.head.data);
        // System.out.println(ll.tail.data);

        // System.out.println(ll.getAt(3));
        // System.out.println();

        ll.display();
        // System.out.println(ll.size);

        ll.deleteAt(4);
        ll.display();
        System.out.println(ll.tail.data);

    }
}
