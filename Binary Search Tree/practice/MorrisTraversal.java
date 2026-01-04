
public class MorrisTraversal {

    static class Node {

        int val;
        Node left, right;

        Node(int val) {
            this.val = val;
            left = right = null;
        }
    }

    public static void morrisInorder(Node root) {
        Node curr = root;

        while (curr != null) {
            if (curr.left == null) {
                System.out.print(curr.val + " ");
                curr = curr.right;
            } else {
                Node pred = curr.left;

                // Find inorder predecessor
                while (pred.right != null && pred.right != curr) {
                    pred = pred.right;
                }

                if (pred.right == null) {
                    // Create thread
                    pred.right = curr;
                    curr = curr.left;
                } else {
                    // Remove thread
                    pred.right = null;
                    System.out.print(curr.val + " ");
                    curr = curr.right;
                    //! Inorder : left -> NODE -> right
                    // PRINT ON THREAD REMOVAL
                }
            }
        }
    }
    // NOTE: print happens after left subtree is done
    // NOTE: 1. create thread -> go left
    // NOTE: 2. remove thread -> 2nd visit (inorder position)

    public static void morrisPreorder(Node root) {
        Node curr = root;

        while (curr != null) {
            if (curr.left == null) {
                System.out.print(curr.val + " ");
                curr = curr.right;
            } else {
                Node pred = curr.left;

                while (pred.right != null && pred.right != curr) {
                    pred = pred.right;
                }

                if (pred.right == null) {
                    System.out.print(curr.val + " "); //! PREORDER difference
                    pred.right = curr;
                    curr = curr.left;
                } else {
                    pred.right = null;
                    curr = curr.right;
                    //! preorder: NODE -> left -> right
                    // PRINT ON THREAD CREATION
                }
            }
        }
    }
    // NOTE: print happens before going left
    // NOTE: 1. 1st visit (preorder position) -> create thread
    // NOTE: 2. remove thread

    public static void main(String[] args) {

        // Build test tree
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(6);

        root.left.left = new Node(1);
        root.left.right = new Node(3);

        root.right.left = new Node(5);
        root.right.right = new Node(7);

        // Test Morris Inorder
        System.out.println("Morris Inorder Traversal:");
        morrisInorder(root);
        System.out.println();

        // Test Morris Preorder
        System.out.println("Morris Preorder Traversal:");
        morrisPreorder(root);
        System.out.println();
    }

}
