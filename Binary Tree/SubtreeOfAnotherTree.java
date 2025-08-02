public class SubtreeOfAnotherTree {
    static class TreeNode{
        int val;
        TreeNode left, right;
        TreeNode(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree{
        private int idx = -1;

        TreeNode buildNode(int[] nodes){
            idx++;
            if(nodes[idx] == -1) return null;

            TreeNode n = new TreeNode(nodes[idx]);
            n.left = buildNode(nodes);
            n.right = buildNode(nodes);

            return n;
        }
    }

    boolean subtreeOfAnotherTree(TreeNode root, TreeNode subRoot){
        if(subRoot == null) return true;
        if(root == null) return false;

        if(isSame(root, subRoot)) return true;

        return isSame(root.left, subRoot) || isSame(root.right, subRoot);
    }

    private boolean isSame(TreeNode a, TreeNode b){
        if(a == null && b == null) return true;
        if(a == null || b == null) return false;
        if(a.val != b.val) return false;

        return isSame(a.left, b.left) && isSame(a.right, b.right);
    }

    public static void main(String[] args) {
        SubtreeOfAnotherTree checker = new SubtreeOfAnotherTree();
        BinaryTree treeBuilder = new BinaryTree();

        // Root tree: [3, 4, 1, -1, -1, 2, -1, -1, 5, -1, -1]
        int[] rootNodes = {3, 4, 1, -1, -1, 2, -1, -1, 5, -1, -1};

        // Subtree: [4, 1, -1, -1, 2, -1, -1]
        int[] subRootNodes = {4, 1, -1, -1, 2, -1, -1};

        TreeNode root = treeBuilder.buildNode(rootNodes);
        treeBuilder.idx = -1; // reset before building next tree
        TreeNode subRoot = treeBuilder.buildNode(subRootNodes);

        boolean isSubtree = checker.subtreeOfAnotherTree(root, subRoot);

        System.out.println("Is subRoot a subtree of root? " + isSubtree);
    }
}
