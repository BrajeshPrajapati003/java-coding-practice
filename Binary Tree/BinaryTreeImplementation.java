
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeImplementation{
    static class Node{
        Node left;
        Node right;
        int val;

        Node(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree{
        private int idx = -1;

        Node buildTree(int nodes[]){
            idx++;
            if(idx >= nodes.length) return null;
            if(nodes[idx] == -1) return null;

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        // DFS - Preorder, Inorder, Postorder

        void preOrder(Node root){
            if(root == null) return;
            System.out.print(root.val + " ");
            preOrder(root.left);
            preOrder(root.right);
        }

        void inOrder(Node root){
            if(root == null) return;
            inOrder(root.left);
            System.out.print(root.val + " ");
            inOrder(root.right);
        }

        void postOrder(Node root){
            if(root == null) return;
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.val + " ");
        }

        // BFS - Level Order Traversal

        void levelOrder(Node root){
            if(root == null) return;

            Queue<Node> q = new LinkedList<>();
            q.offer(root);
            q.offer(null);

            while(!q.isEmpty()){
                Node curr = q.poll();
                if(curr == null){
                    System.out.println();
                    if(q.isEmpty()) break;
                    else q.offer(null);
                }else{
                    System.out.print(curr.val + " ");
                    if(curr.left != null) q.offer(curr.left);
                    if(curr.right != null) q.offer(curr.right);
                }

            }
        }

        List<List<Integer>> levelOrder_ForLoop(Node root){
            List<List<Integer>> ans = new LinkedList<>();
            if(root == null) return ans;

            Queue<Node> q = new LinkedList<>();
            q.offer(root);

            while(!q.isEmpty()){
                int levelSize = q.size();
                List<Integer> level = new ArrayList<>();

                for(int i=0; i<levelSize; i++){
                    Node curr = q.poll();
                    level.add(curr.val);

                    if(curr.left != null) q.offer(curr.left);
                    if(curr.right != null) q.offer(curr.right);
                }
                ans.add(level);
            }
            return ans;
        }

        // Count the total number of nodes present in the tree (TC: O(n))
        int countNodes(Node root){
            if(root == null) return 0;

            int leftNodes = countNodes(root.left);
            int rightNodes = countNodes(root.right);

            return leftNodes + rightNodes + 1;
        }

        // Count the total sum of the node values present in the tree (TC: O(n))
        int sumOfNodes(Node root){
            if(root == null) return 0;

            int leftSum = sumOfNodes(root.left);
            int rightSum = sumOfNodes(root.right);

            return leftSum + rightSum + root.val;
        }

        // Calculate the height of the tree (TC: O(n))
        int height(Node root){
            // if(root == null) return 0; // Height - levelwise
            if(root == null || (root.left == null && root.right == null)) return 0; // Height - edgewise

            int leftHeight = height(root.left);
            int rightHeight = height(root.right);

            int maxHeight = Math.max(leftHeight, rightHeight) + 1;
            return maxHeight;
        }

        // Calculate the diameter of the tree (TC: O(n^2))
        int diameter(Node root){
            if(root == null) return 0;

            int dia1 = diameter(root.left);
            int dia2 = diameter(root.right);
            int dia3 = height(root.left) + height(root.right) + 1;

            return Math.max(dia3, Math.max(dia1, dia2));
        }
    }

    // Calculate the diameter of the tree in linear time (TC: O(n))
    static class TreeInfo{
        int ht, diam;

        public TreeInfo(int ht, int diam) {
            this.ht = ht;
            this.diam = diam;
        }

        static TreeInfo diameter2(Node root){
            if(root == null) return new TreeInfo(0, 0);

            TreeInfo left = diameter2(root.left);
            TreeInfo right = diameter2(root.right);

            int newHeight = Math.max(left.ht, right.ht) + 1;

            int diam1 = left.diam;
            int diam2 = right.diam;
            int diam3 = left.ht + right.ht + 1;

            int newDiam = Math.max(Math.max(diam1, diam2), diam3);
            
            TreeInfo myInfo = new TreeInfo(newHeight, newDiam);
            return myInfo;
        }
    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        System.out.println("Root value: " + root.val); // 1

        System.out.println("Preorder traversal:"); // 1 2 4 5 6
        tree.preOrder(root);
        System.out.println();

        System.out.println("Inorder traversal:"); // 4 2 5 1 6
        tree.inOrder(root);
        System.out.println();

        System.out.println("Postorder traversal:"); // 4 5 2 6 1
        tree.postOrder(root);
        System.out.println();

        System.out.println("Level order traversal:");
        tree.levelOrder(root);
        System.out.println();
        /*
        1
        2 6
        4 5
        */

        System.out.println("Count of Nodes: " + tree.countNodes(root)); // 5
        System.out.println("Sum of Nodes: " + tree.sumOfNodes(root)); // 18
        System.out.println("Height of the tree: " + tree.height(root)); // 3
        System.out.println("Diameter of the tree: " + tree.diameter(root)); // 4
        System.out.println("Diameter2 (Optimized) of the tree: " + TreeInfo.diameter2(root).diam); // 4
    }
}