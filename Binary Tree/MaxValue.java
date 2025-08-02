public class MaxValue {
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

    static int maxValue(Node root){
        if(root == null) return Integer.MIN_VALUE;

        int leftMax = maxValue(root.left);
        int rightMax = maxValue(root.right);

        return Math.max(root.val, Math.max(leftMax, rightMax));
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        int[] rootNodes = {3, 4, 1, -1, -1, 2, -1, -1, 5, -1,5, 9, -1};
        Node root = tree.buildTree(rootNodes);
        System.out.println("Largest value: " + maxValue(root));
    }
}
