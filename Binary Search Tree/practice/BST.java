
public class BST {
    public static class Node{
        int val;
        Node left, right;

        Node(int val){
            this.val = val;
            this.left = this.right = null;
        }
        
    }

    // Insert
    public Node insert(Node root, int key){
        if(root == null) return new Node(key);

        if(key < root.val){
            root.left = insert(root.left, key);
        }else if(key > root.val){
            root.right = insert(root.right, key);
        }
        return root;
    }

    // Search
    public boolean search(Node root, int key){
        if(root == null) return false;
        if(root.val == key) return true;

        return key < root.val ? search(root.left, key) : search(root.right, key);
    }

    // Delete
    public Node delete(Node root, int key){
        if(root == null) return null;
        if(key < root.val){
            root.left = delete(root.left, key);
        }else if(key > root.val){
            root.right = delete(root.right, key);
        }else{
            // Case 1 & 2 : 0 or 1 child
            if(root.left == null) return root.right;
            if(root.right == null) return root.left;

            // Case 3: 2 children
            root.val = minValue(root.right);
            root.right = delete(root.right, key);
        }
        return root;
    }

    private int minValue(Node node){
        int min = node.val;
        while(node.left != null){
            min = node.left.val;
            node = node.left;
        }
        return min;
    }

    // Inorder
    public void inorder(Node root){
        if(root != null){
            inorder(root.left);
            System.out.print(root.val + " ");
            inorder(root.right);
        }
    }

    // Preorder
    public void preorder(Node root){
        if(root != null){
            System.out.print(root.val + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    // Postorder
    public void postorder(Node root){
        if(root != null){
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.val + " ");
        }
    }
}
