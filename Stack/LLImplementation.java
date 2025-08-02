public class LLImplementation {
    public static class Node{
        int data;
        Node next;

        Node(int d){
            this.data = d;
            next = null;
        }
    }

    public static class LLStack{
        Node head;
        int size = 0;

        void push(int data){
            Node node = new Node(data);
            node.next = head;
            head = node;
            size++;
        }

        int pop(){
            if(head == null){
                System.out.println("Stack is empty! Can't pop");
                return -1;
            }

            size--;
            Node top = head;
            head = head.next;
            return top.data;
        }

        int peek(){
            return head.data;
        }

        int size(){
            return size;
        }

        void displayRev(){
            Node curr = head;
            while(curr != null){
                System.out.print(curr.data + " ");
                curr = curr.next;
            }
            System.out.println();
        }

        private void displayRecursion(Node h){
            if(h == null) return;
            displayRecursion(h.next);
            System.out.print(h.data + " ");
        }

        void display(){
            displayRecursion(head);
            System.out.println();
        }

        boolean isEmpty(){
            return head == null;
        }

    }

    public static void main(String[] args) {
        LLStack st = new LLStack();
        for(int i=1; i<11; i++){
            st.push(i);
        }

        System.out.println("Original Stack:");
        st.display();
        // System.out.println("Poping an element: " + st.pop());
        // st.display();
        System.out.println("Peek the stack: " + st.peek());
        
        System.out.println(st.size);
        System.out.println("Is Empty? " + st.isEmpty());

        System.out.println("Popping out all elements:");
        for(int i=1; i<11; i++){
            st.pop();
        }

        System.out.println("New Stack:");
        st.display();
        System.out.println(st.size);
    }
}
