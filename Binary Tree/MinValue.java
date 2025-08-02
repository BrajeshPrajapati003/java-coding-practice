
public class MinValue {
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
    
    static int minValue(Node root){
        if(root == null) return Integer.MAX_VALUE;

        int leftMin = minValue(root.left);
        int rightMin = minValue(root.right);

        return Math.min(root.val, Math.min(leftMin, rightMin));
    }

    public static void main(String[] args) {
        int[] nodes = {1,2,3,4,-20,5,6,7,8,9,10};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println("Minimum Value: " + minValue(root));
    }
}
