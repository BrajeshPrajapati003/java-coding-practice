class LinkedList{
    public static class Node{
        private Node next;
        private String data;

        public Node(String data){
            this.data = data;
        }

        public String data(){
            return data;
        }

        public void setData(String data){
            this.data = data;
        }

        public Node next(){
            return next;
        }

        public void setNext(Node next){
            this.next = next;
        }

        @Override
        public String toString(){
            return this.data;
        }
    }

    private final Node head;
    private Node tail;

    public LinkedList(){
        this.head = new Node("head");
        tail = head;
    }

    public Node head(){
        return head;
    }

    public void add(Node node){
        tail.next = node;
        tail = node;
    }
}

public class FindMiddleElement {
    public static void main(String[] args) {
        LinkedList colList = new LinkedList();
        LinkedList.Node head = colList.head();
        colList.add(new LinkedList.Node("Blue"));
        colList.add(new LinkedList.Node("Pink"));
        colList.add(new LinkedList.Node("Orange"));
        colList.add(new LinkedList.Node("Apple"));
        colList.add(new LinkedList.Node("Mango"));


        // Finding middle element of linkedlist in single pass
        LinkedList.Node curr = head;
        int len = 0;

        LinkedList.Node middle = head;
        while(curr.next() != null){
            len++;
            if(len%2 == 0){
                middle = middle.next();
            }
            curr  = curr.next();
        }

        if(len % 2 == 1){
            middle = middle.next();
        }

        System.out.println("Length of linkedlist: " + len);
        System.out.println("Middl element of linkedlist: " + middle);
    }
}
