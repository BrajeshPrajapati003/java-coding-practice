import java.util.ArrayList;
import java.util.List;

public class CriticalMaxMinPoint {

    public static class Node{
        int val;
        Node prev;
        Node next;
        public Node(int val){
            this.val = val;
        }
    }

    public static List<List<Integer>> findCritialPoints(Node head) {
        Node curr = head.next;
        List<List<Integer>> criticalPoints = new ArrayList<>();
        criticalPoints.add(new ArrayList<>());
        criticalPoints.add(new ArrayList<>());

        while(curr.next != null && curr.next.next != null){
            if(curr.prev.val < curr.val && curr.next.val < curr.val){
                criticalPoints.get(0).add(curr.val);
            }else if(curr.prev.val > curr.val && curr.next.val > curr.val){
                criticalPoints.get(1).add(curr.val);
            }
            curr = curr.next;
        }
        return criticalPoints;
    }
    public static void main(String[] args) {
        Node head1 = new Node(3);
        Node node1_4 = new Node(4);
        Node node1_1 = new Node(1);
        Node node1_2 = new Node(2);
        Node node1_5 = new Node(5);
        Node node1_last1 = new Node(1);
        Node node1_6 = new Node(6);

        // Link them up for a doubly linked list
        head1.next = node1_4;
        node1_4.prev = head1;

        node1_4.next = node1_1;
        node1_1.prev = node1_4;

        node1_1.next = node1_2;
        node1_2.prev = node1_1;

        node1_2.next = node1_5;
        node1_5.prev = node1_2;

        node1_5.next = node1_last1;
        node1_last1.prev = node1_5;

        node1_last1.next = node1_6;
        node1_6.prev = node1_last1;

        System.out.println("--- Test Case 1: Standard Example ---");
        System.out.println("Input List: [3, 4, 1, 2, 5, 1, 6]");
        List<List<Integer>> result1 = findCritialPoints(head1);
        System.out.println("Local Maxima (Expected: [4, 5]): " + result1.get(0));
        System.out.println("Local Minima (Expected: [1, 1]): " + result1.get(1));
        System.out.println("---");


        // Test Case 2: List with no critical points (monotonically increasing)
        Node head2 = new Node(1);
        Node node2_2 = new Node(2);
        Node node2_3 = new Node(3);
        Node node2_4 = new Node(4);
        Node node2_5 = new Node(5);

        head2.next = node2_2; node2_2.prev = head2;
        node2_2.next = node2_3; node2_3.prev = node2_2;
        node2_3.next = node2_4; node2_4.prev = node2_3;
        node2_4.next = node2_5; node2_5.prev = node2_4;

        System.out.println("\n--- Test Case 2: Monotonically Increasing ---");
        System.out.println("Input List: [1, 2, 3, 4, 5]");
        List<List<Integer>> result2 = findCritialPoints(head2);
        System.out.println("Local Maxima (Expected: []): " + result2.get(0));
        System.out.println("Local Minima (Expected: []): " + result2.get(1));
        System.out.println("---");

        // Test Case 3: List with one critical point (max)
        Node head3 = new Node(1);
        Node node3_5 = new Node(5);
        Node node3_2 = new Node(2);

        head3.next = node3_5; node3_5.prev = head3;
        node3_5.next = node3_2; node3_2.prev = node3_5;

        System.out.println("\n--- Test Case 3: One Critical Point (Max) ---");
        System.out.println("Input List: [1, 5, 2]");
        List<List<Integer>> result3 = findCritialPoints(head3);
        System.out.println("Local Maxima (Expected: [5]): " + result3.get(0));
        System.out.println("Local Minima (Expected: []): " + result3.get(1));
        System.out.println("---");

        // Test Case 4: List with one critical point (min)
        Node head4 = new Node(5);
        Node node4_1 = new Node(1);
        Node node4_8 = new Node(8);

        head4.next = node4_1; node4_1.prev = head4;
        node4_1.next = node4_8; node4_8.prev = node4_1;

        System.out.println("\n--- Test Case 4: One Critical Point (Min) ---");
        System.out.println("Input List: [5, 1, 8]");
        List<List<Integer>> result4 = findCritialPoints(head4);
        System.out.println("Local Maxima (Expected: []): " + result4.get(0));
        System.out.println("Local Minima (Expected: [1]): " + result4.get(1));
        System.out.println("---");

        // Test Case 5: Empty list
        Node head5 = null;
        System.out.println("\n--- Test Case 5: Empty List ---");
        System.out.println("Input List: []");
        List<List<Integer>> result5 = findCritialPoints(head5);
        System.out.println("Local Maxima (Expected: []): " + result5.get(0));
        System.out.println("Local Minima (Expected: []): " + result5.get(1));
        System.out.println("---");

        // Test Case 6: List with only 2 nodes
        Node head6 = new Node(10);
        Node node6_20 = new Node(20);
        head6.next = node6_20; node6_20.prev = head6;
        
        System.out.println("\n--- Test Case 6: Two Nodes List ---");
        System.out.println("Input List: [10, 20]");
        List<List<Integer>> result6 = findCritialPoints(head6);
        System.out.println("Local Maxima (Expected: []): " + result6.get(0));
        System.out.println("Local Minima (Expected: []): " + result6.get(1));
        System.out.println("---");
    }
}
