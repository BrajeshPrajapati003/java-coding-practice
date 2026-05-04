
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FindIfPathExists {
    public boolean findIfPathExists(int n, int[][] edges, int start, int end){
        if(start == end) return true;

        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0; i<n; i++){
            adj.add(new ArrayList<>());
        }

        for (int[] edge: edges) {
            int a = edge[0];
            int b = edge[1];
            adj.get(a).add(b);
            adj.get(b).add(a);
        }

        boolean[] vis = new boolean[n];
        vis[start] = true;
        bfs(adj, vis, start, end);
        return vis[end];
    }

    private void bfs(List<List<Integer>> adj, boolean[] vis, int start, int end){
        Queue<Integer> q = new LinkedList<>();
        q.add(start);

        while(!q.isEmpty()){
            int front = q.remove();

            for(int el: adj.get(front)){
                
                if(!vis[el]){
                    vis[el] = true;
                    q.add(el);
                    if(end == el) return;
                }
            }
        }
    }
}
