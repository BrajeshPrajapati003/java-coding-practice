
public class TreeProduct {
    static class Node{
        int val;
        Node left, right;

        public Node(int val) {
            this.val = val;
        }
    }

    static class BinaryTree{
        private int idx = -1;

        Node buildTree(int[] nodes){
            idx++;
            if(idx >= nodes.length) return null;
            if(nodes[idx] == -1) return null;

            Node n = new Node(nodes[idx]);
            n.left = buildTree(nodes);
            n.right = buildTree(nodes);
            return n;
        }

        void resetIdx(){
            idx = -1;
        }
    }

    static long getProduct(Node root){
        if(root == null) return 1;

        long leftProd = getProduct(root.left);
        long rightProd = getProduct(root.right);

        return leftProd * rightProd * root.val;
    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 3, 10, 99, 23, 78};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println("Product of the Values: " + getProduct(root));
    }
}
