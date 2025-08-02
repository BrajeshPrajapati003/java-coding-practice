
public class CountNodes_PerfectBT {
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
            if(idx >= nodes.length || nodes[idx] == -1) return null;

            Node n = new Node(nodes[idx]);
            n.left = buildTree(nodes);
            n.right = buildTree(nodes);
            return n;
        }
    }

    static int countNodes(Node root){
        if(root == null) return 0;

        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);

        if(leftHeight == rightHeight) return (1 + (1 << leftHeight) - 1 + countNodes(root.right));
        else{
            // leftHeight > rightHeight
            return (1 + (1 << rightHeight) - 1 + countNodes(root.left));
        }
    }

    static int getHeight(Node root){
        if(root == null) return 0;

        int ht = 0;
        while(root != null){
            ht++;
            root = root.left;
        }
        return ht;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1};
        Node root = tree.buildTree(nodes);
        System.out.println("Total number of nodes: " + countNodes(root)); // 7
    }
}
