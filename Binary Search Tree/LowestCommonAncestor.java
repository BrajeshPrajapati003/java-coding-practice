
public class LowestCommonAncestor {
    public static class Node{
        int val;
        Node left, right;
        Node(int val){
            this.val = val;
            left = right = null;
        }
    }
    public static Node lowestCommonAncestor(Node root, Node p, Node q){
        while(root != null){
            if(p.val < root.val && q.val < root.val) root = root.left;
            else if(p.val > root.val && q.val > root.val) root = root.right;
            else return root; // split happens here
        }

        return null;
    }

    public static void main(String[] args) {

        // Build BST
        Node root = new Node(6);
        root.left = new Node(2);
        root.right = new Node(8);
        root.left.left = new Node(0);
        root.left.right = new Node(4);
        root.left.right.left = new Node(3);
        root.left.right.right = new Node(5);
        root.right.left = new Node(7);
        root.right.right = new Node(9);

        Node p = root.left;            // 2
        Node q = root.right;           // 8

        Node lca = lowestCommonAncestor(root, p, q);
        System.out.println("LCA of 2 and 8: " + lca.val);

        p = root.left.right.left;          // 3
        q = root.left.right.right;         // 5

        lca = lowestCommonAncestor(root, p, q);
        System.out.println("LCA of 3 and 5: " + lca.val);
    }
}
