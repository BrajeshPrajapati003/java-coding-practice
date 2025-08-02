public class TwoSumDoublyLL {
    public static class Node{
        int val;
        Node next;
        Node prev;
        public Node(int val){
            this.val = val;
        }
    }

    public static void display(Node head){
        Node curr = head;
        while(curr.next != null){
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    // Considering the list is sorted in increasing order
    public static int[] twoSum(Node head, int target){
        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        Node tail = curr;
        curr = head;
        while(tail != curr){
            if(curr.val + tail.val == target){
                return new int[]{curr.val, tail.val};
            }else if(tail.val + curr.val > target){
                tail = tail.prev;
            }else{
                curr = curr.next;
            }
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        a.next = b;
        a.prev = null;
        b.next = c;
        b.prev = a;
        c.next = d;
        c.prev = b;
        d.next = e;
        d.prev = c;
        e.next = f;
        e.prev = d;
        f.next = null;
        f.prev = e;
        display(a);

        int[] arr = twoSum(a, 6);
        System.out.println(arr[0] + "," + arr[1]);
    }
}
