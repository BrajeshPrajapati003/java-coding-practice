
public class PreorderTraversal{
    static class TreeNode{
        TreeNode left, right;
        int val;
        TreeNode(int val){
            this.val = val;
        }
    }

    static class BinaryTree{
        private int idx = -1;
        TreeNode buildTree(int[] nums){
            idx++;
            if(idx < nums.length && nums[idx] == -1) return null;

            TreeNode n = new TreeNode(nums[idx]);
            n.left = buildTree(nums);
            n.right = buildTree(nums);

            return n;
        }

        void preOrder(TreeNode root){
            if(root == null) return;
            System.out.print(root.val + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 4, -1, -1, 5, -1, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        TreeNode root = tree.buildTree(nums);
        tree.preOrder(root);

    }
}