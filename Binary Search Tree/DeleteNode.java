
public class DeleteNode {

    static class Node {
        int val;
        Node left, right;

        Node(int val) {
            this.val = val;
        }
    }

    public static Node deleteNode(Node root, int key) {
        Node parent = null;
        Node curr = root;

        // Find node to delete
        while (curr != null && curr.val != key) {
            parent = curr;
            if (key < curr.val) {
                curr = curr.left; 
            }else {
                curr = curr.right;
            }
        }

        if (curr == null) {
            return root; // key not found
        }

        // node has 0 or 1 child
        Node child = (curr.left != null) ? curr.left : curr.right;

        if (parent == null) {
            // deleting root
            return child;
        }

        if (parent.left == curr) {
            parent.left = child; 
        }else {
            parent.right = child;
        }
        
        // node has TWO children
        if (curr.left != null && curr.right != null) {

            // Find inorder predecessor using Morris
            Node predParent = curr;
            Node pred = curr.left;

            while (pred.right != null && pred.right != curr) {
                predParent = pred;
                pred = pred.right;
            }

            // Replace value
            curr.val = pred.val;

            // Now delete predecessor node
            curr = pred;
            parent = predParent;
        }

        return root;
    }

}
