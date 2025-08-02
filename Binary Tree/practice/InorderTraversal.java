public class InorderTraversal {
    static class Node{
        Node left, right;
        int val;
        Node(int val){
            this.val = val;
        }
    }

    static class BinaryTree{
        private int idx = -1;

        Node buildTree(int[] nodes){
            idx++;
            if(idx > nodes.length || nodes[idx] == -1) return null;

            Node n = new Node(nodes[idx]);
            n.left = buildTree(nodes);
            n.right = buildTree(nodes);

            return n;
        }

        void inOrder(Node root){
            if(root == null) return;
            inOrder(root.left);
            System.out.print(root.val + " ");
            inOrder(root.right);
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 6, -1, -1};
        Node root = tree.buildTree(nodes);
        tree.inOrder(root);
    }
}
