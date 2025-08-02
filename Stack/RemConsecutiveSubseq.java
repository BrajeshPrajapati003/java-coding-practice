
public class RemConsecutiveSubseq {
    static class Node{
        int val;
        Node next = null;
        Node(int val){
            this.val = val;
        }
    }

    static class Stack{
        private int size = 0;
        private Node head;

        void push(int val){
            Node n = new Node(val);
            n.next = head;
            head = n;
            size++;
        }

        int pop(){
            if(head == null){
                System.out.println("Stack is empty! Can't pop()");
                return 0;
            }

            int num = head.val;
            head = head.next;
            size--;
            return num;
        }

        int peek(){
            if(head == null){
                System.out.println("Stack is empty! Can't pop()");
                return 0;
            }

            return head.val;
        }

        int size(){
            return size;
        }
    }
    
    public static int[] remove(int[] arr){
        int n = arr.length;
        Stack st = new Stack();
        for(int i=0; i<n; i++){
            if(st.size() ==0 || st.peek() != arr[i]) st.push(arr[i]);
            else if(arr[i] == st.peek()){
                if(i == n-1 || arr[i] != arr[i+1]) st.pop();
            }
        }

        int[] res = new int[st.size()];
        int m = res.length;
        for(int i=m-1; i>=0; i--){
            res[i] = st.pop();
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 10, 10, 4, 4, 4, 5, 7, 7, 2};
        int[] res = remove(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}

