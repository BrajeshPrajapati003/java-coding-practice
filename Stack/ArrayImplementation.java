public class ArrayImplementation {
    public static class Stack{
        private final int[] arr = new int[5];
        private int idx = 0;

        void push(int x){
            if(isFull()){
                System.out.println("Stack is full! Can't push...");
                return;
            }

            arr[idx] = x;
            idx++;
        }

        int pop(){
            if(isEmpty()){
                System.out.println("Stack is Empty! Can't pop...");
                return -1;
            }

            int temp = arr[idx-1];
            arr[idx-1] = 0;
            idx--;
            return temp;
        }

        int peek(){
            if(idx == 0){
                System.out.println("Stack is Empty!");
                return -1;
            }

            return arr[idx-1];
        }

        boolean isEmpty(){
            return idx == 0;
        }

        boolean isFull(){
            return idx == arr.length;
        }

        void display(){
            if(idx == 0){
                System.out.println("Stack is empty!");
                return;
            }

            for(int i=0; i<idx; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        void displayReverse(){
            if(idx == 0){
                System.out.println("Stack is Empty!");
                return;
            }

            for(int i=idx-1; i>=0; i--){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        int capacity(){
            return arr.length;
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        for (int i = 1; i <= 5; i++) {
            st.push(i);
        }

        st.display();
        System.out.println("Pop element: " + st.pop());
        st.display();
        System.out.println("Peek element: " + st.peek());
        st.display();
        st.push(43);
        st.display();
        st.push(45);
        System.out.println("Poping out all elements!");

        for(int i=0; i<5; i++){
            st.pop();
        }
        st.display();
        st.pop();

        System.out.println("Stack Capacity: " + st.capacity());
    }
}
