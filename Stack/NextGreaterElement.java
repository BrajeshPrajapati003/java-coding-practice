
import java.util.Arrays;

public class NextGreaterElement {

    static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }

    static class Stack{
        private Node head;
        private int size = 0;

        void push(int val){
            Node n = new Node(val);
            n.next = head;
            head = n;
            size++;
        }

        int pop(){
            if(head == null) throw new RuntimeException("Stack underflow");
            Node n = head;
            head = head.next;
            size--;
            return n.val;
        }

        int peek(){
            if(head == null) throw new RuntimeException("Stack underflow");
            return head.val;
        }

        int size(){
            return size;
        }
    }

    public static int[] nextGreaterElem_Stack(int[] arr){
        Stack st = new Stack();
        int n = arr.length;
        int[] res = new int[n];

        // -> pop, ans mark, push

        // Right to left
        for(int i=n-1; i>=0; i--){
            while(st.size() != 0 && st.peek() < arr[i]){
                st.pop();
            }

            res[i] = st.size() == 0 ? -1 : st.peek();
            st.push(arr[i]);
        }
        return res;
    }

    public static int[] nextGreaterElem_Loops(int[] arr){
        int[] res = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            res[i] = -1;
            int j = i+1;
            while(j<arr.length){
                if(arr[i] < arr[j]){
                    res[i] = arr[j];
                    break;
                }else{
                    j++;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 2, 1, 6, 3, 4};
        System.out.println("Given Array: " + Arrays.toString(arr));

        // Simply using loops TC: O(n^2)
        System.out.println("Using loops: " + Arrays.toString(nextGreaterElem_Loops(arr))); // [5, 6, 6, 6, 6, -1, 4, -1]

        // Using stack TC: O(n)
        System.out.println("Using Stack: " + Arrays.toString(nextGreaterElem_Stack(arr))); // [5, 6, 6, 6, 6, -1, 4, -1]

        
    }
}
