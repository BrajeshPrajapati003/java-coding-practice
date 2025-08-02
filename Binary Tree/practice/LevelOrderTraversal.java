
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {
    static class Node{
        Node left, right;
        int val;
        Node(int val){
            this.val = val;
        }
    }

    static class BinaryTree{
        private int idx = -1;

        Node buildTree(int[] nums){
            idx++;
            if(idx >= nums.length || nums[idx] == -1) return null;

            Node n = new Node(nums[idx]);
            n.left = buildTree(nums);
            n.right = buildTree(nums);
            return n;
        }

        void levelOrder(Node root){
            if(root == null) return;

            Queue<Node> q = new LinkedList<>();
            q.offer(root);
            q.offer(null);

            while(!q.isEmpty()){
                Node curr = q.poll();
                if(curr == null){
                    System.out.println();
                    if(q.isEmpty()) break;
                    else q.offer(null);
                }else{
                    System.out.print(curr.val);
                    if(curr.left != null) q.offer(curr.left);
                    if(curr.right != null) q.offer(curr.right);
                }
            }
        }

        List<List<Integer>> levelOrder_ForLoop(Node root){
            List<List<Integer>> ans = new LinkedList<>();
            if(root == null) return ans;

            Queue<Node> q = new LinkedList<>();
            q.offer(root);

            while(!q.isEmpty()){
                int levelSize = q.size();
                List<Integer> level = new ArrayList<>();

                for(int i=0; i<levelSize; i++){
                    Node curr = q.poll();
                    level.add(curr.val);

                    if(curr.left != null) q.offer(curr.left);
                    if(curr.right != null) q.offer(curr.right);
                }
                ans.add(level);
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 6, -1, -1};
        Node root = tree.buildTree(nodes);
        System.out.println("Level order traversal void display:");
        tree.levelOrder(root);

        System.out.println("Level Order traversal returning a list:");
        List<List<Integer>> list = tree.levelOrder_ForLoop(root);
        System.out.println(list); // [[1], [2, 6], [4, 5]]
    }
}
