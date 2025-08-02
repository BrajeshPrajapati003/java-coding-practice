import java.util.Stack;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val){
        this.val = val;
    }
}

class BSTIterator{
    private final Stack<TreeNode> stack;

    public BSTIterator(TreeNode root){
        stack = new Stack<>();
        pushAll(root);
    }

    public boolean hasNext(){
        return !stack.isEmpty();
    }

    public int next(){
        TreeNode node = stack.pop();
        pushAll(node.right);
        return node.val;
    }

    private void pushAll(TreeNode node){
        while(node != null){
            stack.push(node);
            node = node.left;
        }
    }
}

public class BSTIteratorUsingStack {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(43);
        root.left = new TreeNode(67);
        root.right = new TreeNode(66);
        root.right.left = new TreeNode(71);

        BSTIterator iterator = new BSTIterator(root);

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
    