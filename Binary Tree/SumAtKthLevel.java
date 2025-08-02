import java.util.LinkedList;
import java.util.Queue;

public class SumAtKthLevel{
    static class TreeNode{
        int val;
        TreeNode left, right;
        TreeNode(int val){
            this.val = val;
            left = right = null;
        }
    }

    static int sumAtKthLevel(TreeNode root, int k){
        if(root == null) return 0;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int level = 0;

        while(!q.isEmpty()){
            int size = q.size();
            int levelSum = 0;

            for(int i=0; i<size; i++){
                TreeNode node = q.poll();
                if(level == k) levelSum += node.val;

                if(node.left != null) q.offer(node.left);
                if(node.right != null) q.offer(node.right);
            }

            if(level == k) return levelSum;
            level++;
        }
        
        // If k is greater than height of the tree
        return 0;
    }

    public static void main(String[] args) {
        /*
                      1
                    /   \
                   2     3
                  / \   / \
                 4   5 6   7
        */

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        int K = 2; // 0-indexed
        System.out.println("Sum at level " + K + " is: " + sumAtKthLevel(root, K));
    }
}