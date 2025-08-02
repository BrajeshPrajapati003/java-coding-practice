
public class BinarySearchTree{
    static class Node{
        Node left, right;
        int val;
        Node(int val){
            this.val = val;
            left = right = null;
        }
    }

    static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.val > val){
            // Left Subtree
            root.left = insert(root.left, val);
        }else{
            root.right = insert(root.right, val);
        }

        return root;
    }

    static boolean search(Node root, int key){
        if(root == null) return false;
        if(root.val == key) return true;

        else if(root.val > key) return search(root.left, key);

        return search(root.right, key);
    }

    static Node delete(Node root, int val){
        if(root.val > val) root.left = delete(root.left, val);
        else if(root.val < val) root.right = delete(root.right, val);
        else{
            // root.val == val
            // Case 1
            if(root.left == null && root.right == null) return null;

            // Case 2
            if(root.left == null) return root.right;
            else if(root.right == null) return root.left;

            // Case 3
            Node inorderSuccessor = inorderSuccessor(root.right);
            root.val = inorderSuccessor.val;
            root.right = delete(root.right, inorderSuccessor.val);
        }

        return root;
    }

    static Node inorderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }

    static void inorder(Node root){
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        int[] values = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;

        for(int i=0; i<values.length; i++){
            root = insert(root, values[i]);
        }

        inorder(root);
        System.out.println();
        
        if(search(root, 11)){
            System.out.println("Found!");
        }else{
            System.out.println("Not found!");
        }
        
    }
}