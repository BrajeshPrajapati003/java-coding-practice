public class Add2LL {

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    void printList(Node head){
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    Node head1, head2, resultHead;
    void push(int data, int list){
        // Create a new digit node
        Node newNode = new Node(data);
        switch (list) {
            case 1 -> {
                newNode.next = head1;
                head1 = newNode;
            }
            case 2 -> {
                newNode.next = head2;
                head2 = newNode;
            }
            default -> {
                newNode.next = resultHead;
                resultHead = newNode;
            }
        }
    }

    int carryOver;
    void addSameSize(Node n, Node m){
        if(n == null) return;

        addSameSize(n.next, m.next);
        int sum = n.data + m.data + carryOver;
        carryOver = sum / 10;
        sum = sum % 10;
        push(sum, 3);
    }

    Node alignmentPointer;
    void propagateCarry(Node head1){
        if(head1 != alignmentPointer){
            propagateCarry(head1.next);
            int sum = carryOver + head1.data;
            carryOver = sum / 10;
            sum %= 10;
            push(sum, 3);
        }
    }

    int getSize(Node head){
        int count = 0;
        while(head != null){
            count++;
            head = head.next;
        }
        return count;
    }

    void addLists(){
        if(head1 == null){
            resultHead = head2;
            return;
        }

        if(head2 == null){
            resultHead = head1;
            return;
        }

        int size1 = getSize(head1);
        int size2 = getSize(head2);
        
        if(size1 == size2){
            addSameSize(head1, head2);
        }else{
            if(size1 < size2){
                Node temp = head1;
                head1 = head2;
                head2 = temp;
            }

            int diff = Math.abs(size1 - size2);
            Node temp = head1;
            while(diff-- >= 0){
                alignmentPointer = temp;
                temp = temp.next;
            }

            addSameSize(alignmentPointer, head2);
            propagateCarry(head1);
        }
        
        if(carryOver > 0) push(carryOver, 3);
    }

    public static void main(String[] args) {
        Add2LL list = new Add2LL();
        list.head1 = null;
        list.head2 = null;
        list.resultHead = null;
        list.carryOver = 0;

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};

        for(int i=arr1.length-1; i>=0; i--){
            list.push(arr1[i], 1);
        }

        for(int i=arr2.length-1; i>=0; i--){
            list.push(arr2[i], 2);
        }

        list.addLists();
        list.printList(list.resultHead);
    }
}
