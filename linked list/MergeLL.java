public class MergeLL {
    private Node head;

    public MergeLL() {
        head = null;
    }
    
    class Node{
        String data;
        Node next;
        public Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    void addFirst(String data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void addLast(String data){
        if(head == null){
            head = new Node(data);
            return;
        }

        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = new Node(data);
    }

    // void delete(){
    //     head = null;
    //     System.out.println("List deleted (made eligible for garbage collection");
    // }

    void mergeAlternate(MergeLL q){
        Node pCurr = this.head;
        Node qCurr = q.head;

        if(pCurr == null){
            this.head = q.head;
            q.head = null;
            System.out.println("1st list was empty, merged 2nd list.");
            return;
        }

        if(qCurr == null){
            System.out.println("2nd list was empty, no merging needed.");
            return;
        }

        Node pNext, qNext;

        while(pCurr != null && qCurr != null){
            pNext = pCurr.next;
            qNext = qCurr.next;

            pCurr.next = qCurr;
            qCurr.next = pNext;
            
            pCurr = pNext;
            qCurr = qNext;
        }

        if(qCurr != null){
            Node tempCurr = this.head;
            while(tempCurr != null && tempCurr.next != null){
                tempCurr = tempCurr.next;
            }

            if(tempCurr != null){
                tempCurr.next = qCurr;
            }
        }

        q.head = null;
    }

    void display(){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MergeLL l1 = new MergeLL();
        l1.addLast("Brajesh");
        l1.addLast("Kashish");
        l1.addFirst("Kavita");

        MergeLL l2 = new MergeLL();
        l2.addLast("43");
        l2.addLast("66");
        l2.addLast("67");
        l1.display();
        l2.display();

        l1.mergeAlternate(l2);
        l1.display();
    }
}
