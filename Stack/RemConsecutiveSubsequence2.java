public class RemConsecutiveSubsequence2 {
    static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
            this.next = null;
        }
    }

    static class Stack{
        private Node head;
        private int size = 0;

        void push(int val){
            Node n = new Node(val);
            n.next =  head;
            head = n;
            size++;
        }

        int pop(){
            Node n = head;
            head = head.next;
            size--;
            return n.val;
        }

        int peek(){
            return head.val;
        }

        int size(){
            return size;
        }

        void print(){
            Node h = head;
            while(h != null){
                System.out.print(h.val + " ");
                h = h.next;
            }
            System.out.println();
        }
    }

    static int[] remConsecutive(int[] arr){
        int n = arr.length;
        Stack st = new Stack();
        for(int i=0; i<n; i++){
            if(st.size() == 0 || st.peek() != arr[i]) st.push(arr[i]);
            else if(st.peek() == arr[i]){
                if(i == n-1 || arr[i] != arr[i+1]) st.pop();
            }
        }

        int m = st.size();
        int[] res = new int[m];
        for(int i=m-1; i>=0; i--){
            res[i] = st.pop();
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 10, 10, 4, 4, 4, 5, 7, 7, 2};
        int[] res = remConsecutive(arr); // 1 3 5 2 
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}