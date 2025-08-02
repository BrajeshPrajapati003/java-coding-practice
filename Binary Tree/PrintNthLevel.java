import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PrintNthLevel {
    static class Node{
        int val;
        Node left, right;
        Node(int val){
            this.val = val;
        }
    }

    static class BinaryTree{
        private int idx = -1;
        
        Node buildTree(int[] nodes){
            idx++;
            if(idx >= nodes.length || nodes[idx] == -1) return null;

            Node n = new Node(nodes[idx]);
            n.left = buildTree(nodes);
            n.right = buildTree(nodes);
            return n;
        }

        void resetId(){
            idx = -1;
        }
    }

    // Using dfs - recursive
    static void kthLevel(Node root, int n){
        if(root == null) return;
        if(n == 0) System.out.print(root.val + " "); // 0-based indexing of levels
        kthLevel(root.left, n-1);
        kthLevel(root.right, n-1);
    }

    // Using bfs - iterative
    static List<Integer> printKthElem(Node root, int targetLevel){
        List<Integer> ans = new ArrayList<>();
        if(root == null) return ans;

        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        int level = 0; // 0-based indexing of levels

        while(!q.isEmpty()){
            int levelSize = q.size();
            
            if(level == targetLevel){
                for(int i=0; i<levelSize; i++){
                    Node curr = q.poll();
                    if(curr != null) ans.add(curr.val);
                }
                return ans;
            }else{
                for(int i=0; i<levelSize; i++){
                    Node curr = q.poll();
                    if(curr.left != null) q.offer(curr.left);
                    if(curr.right != null) q.offer(curr.right);
                }
            }
            level++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nodes3 = {1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes3);
        // System.out.println("Kth level elements: " + printKthElem(root, 2));
        kthLevel(root, 2);
        // Output:- Kth level elements: [4, 5, 6, 7]
    }
}
