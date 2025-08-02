import java.util.LinkedList;
import java.util.Queue;

public class MinAndMaxDepth {

    static class Node{
        Node left, right;
        int val;
        Node(int val){
            this.val = val;
        }
    }

    static class BinaryTree{
        // The Instance Variable
        private int idx = -1;

        Node buildTree(int[] nodes){
            // Increment the instance variable
            idx++;

            if(idx >= nodes.length) return null;
            if(nodes[idx] == -1) return null;

            Node n = new Node(nodes[idx]);
            n.left = buildTree(nodes);
            n.right = buildTree(nodes);

            return n;
        }

        // This method resets the instance variable 'idx' to its initial state
        // Just call this method to reset the instance for testing it on an another testcase
        void resetIdx(){
            this.idx = -1;
        }
    }

    // dfs - Not preferred for minimum depths - recursive (unnecessary traversing before finding the min depth)
    // bfs - Not preferred for maximum depths (overhead -> queue, and operation on it isn't as efficient as the JVM's call stack)

    // dfs - preferred for max depth

    int dfs_MinDepth(Node root){
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 1;

        if(root.left == null) return 1 + dfs_MinDepth(root.right);
        if(root.right == null) return 1 + dfs_MinDepth(root.left);

        return 1 + Math.min(dfs_MinDepth(root.left), dfs_MinDepth(root.right));
    }

    int dfs_MaxDepth(Node root){
        if(root == null) return 0;

        int leftDepth = dfs_MaxDepth(root.left);
        int rightDepth = dfs_MaxDepth(root.right);

        return 1 + Math.max(leftDepth, rightDepth);
    }

    // bfs - Preferred min depth

    int bfs_MinDepth(Node root){
        if(root == null) return 0;
        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        int depth = 1;
        while(!q.isEmpty()){
            int levelSize = q.size();
            for(int i=0; i<levelSize; i++){
                Node curr = q.poll();

                if(curr.left == null && curr.right == null) return depth;

                if(curr.left != null) q.offer(curr.left);
                if(curr.right != null) q.offer(curr.right);
            }
            depth++;
        }
        return depth;
    }

    int bfs_MaxDepth(Node root){
        if(root == null) return 0;
        Queue<Node> q = new LinkedList<>();
        int depth = 0;
        
        while(!q.isEmpty()){
            int levelSize = q.size();
            for(int i=0; i<levelSize; i++){
                Node curr = q.poll();
                if(curr.left != null) q.offer(curr.left);
                if(curr.right != null) q.offer(curr.right);
            }
            depth++;
        }
        return depth;
    }


    public static void main(String[] args) {
        MinAndMaxDepth solver = new MinAndMaxDepth(); // Create an instance of the main class
        BinaryTree treeBuilder = new BinaryTree();   // Create an instance for building trees

        // --- Test Case 1: A balanced tree ---
        // Tree:
        //          1
        //         / \
        //        2   3
        //       / \ / \
        //      4  5 6  7
        // Min Depth: 3 (Path 1-2-4, 1-2-5, 1-3-6, 1-3-7)
        // Max Depth: 3 (Same as min in this perfect tree)
        int[] nodes1 = {1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1};
        Node root1 = treeBuilder.buildTree(nodes1);

        System.out.println("--- Test Case 1: Balanced Tree ---");
        System.out.println("Min Depth (DFS): " + solver.dfs_MinDepth(root1)); // Expected: 3
        System.out.println("Max Depth (DFS): " + solver.dfs_MaxDepth(root1)); // Expected: 3
        System.out.println("Min Depth (BFS): " + solver.bfs_MinDepth(root1)); // Expected: 3
        System.out.println("Max Depth (BFS): " + solver.bfs_MaxDepth(root1)); // Expected: 3
        System.out.println();

        // Reset the tree builder for the next test case
        treeBuilder.resetIdx();


        // --- Test Case 2: A skewed tree with varying depths ---
        // Tree:
        //          1
        //         / \
        //        2   3
        //       /     \
        //      4       5
        //     /         \
        //    6           7
        // Min Depth: 3 (Path 1-3-5) -- No wait, 1-3-5 is depth 3. What if 3 had a left child at depth 3?
        // Let's make one branch really short and another really long.
        // Tree structure:
        //          1
        //         / \
        //        2   3
        //       / \
        //      4   -1 (null, meaning 2 has only left child)
        //     /
        //    5
        //   /
        //  6
        // Min Depth: 2 (Path 1-3)
        // Max Depth: 5 (Path 1-2-4-5-6)
        int[] nodes2 = {1, 2, 4, 5, 6, -1, -1, -1, -1, -1, 3, -1, -1};
        Node root2 = treeBuilder.buildTree(nodes2);

        System.out.println("--- Test Case 2: Skewed Tree ---");
        System.out.println("Min Depth (DFS): " + solver.dfs_MinDepth(root2)); // Expected: 2
        System.out.println("Max Depth (DFS): " + solver.dfs_MaxDepth(root2)); // Expected: 5
        System.out.println("Min Depth (BFS): " + solver.bfs_MinDepth(root2)); // Expected: 2
        System.out.println("Max Depth (BFS): " + solver.bfs_MaxDepth(root2)); // Expected: 5
        System.out.println();

        // --- Test Case 3: Empty Tree ---
        treeBuilder.resetIdx();
        int[] nodes3 = {-1};
        Node root3 = treeBuilder.buildTree(nodes3);

        System.out.println("--- Test Case 3: Empty Tree ---");
        System.out.println("Min Depth (DFS): " + solver.dfs_MinDepth(root3)); // Expected: 0
        System.out.println("Max Depth (DFS): " + solver.dfs_MaxDepth(root3)); // Expected: 0
        System.out.println("Min Depth (BFS): " + solver.bfs_MinDepth(root3)); // Expected: 0
        System.out.println("Max Depth (BFS): " + solver.bfs_MaxDepth(root3)); // Expected: 0
        System.out.println();

        // --- Test Case 4: Single Node Tree ---
        treeBuilder.resetIdx();
        int[] nodes4 = {10, -1, -1};
        Node root4 = treeBuilder.buildTree(nodes4);

        System.out.println("--- Test Case 4: Single Node Tree ---");
        System.out.println("Min Depth (DFS): " + solver.dfs_MinDepth(root4)); // Expected: 1
        System.out.println("Max Depth (DFS): " + solver.dfs_MaxDepth(root4)); // Expected: 1
        System.out.println("Min Depth (BFS): " + solver.bfs_MinDepth(root4)); // Expected: 1
        System.out.println("Max Depth (BFS): " + solver.bfs_MaxDepth(root4)); // Expected: 1
        System.out.println();
    }
}