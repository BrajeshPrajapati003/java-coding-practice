
import java.util.LinkedList;
import java.util.Queue;

public class NoOfProvinces {
    public int numOfProvinces(int[][] adj){
        int n = adj.length;
        int provinces = 0;
        boolean[] vis = new boolean[n];

        for(int i=0; i<n; i++){
            if(!vis[i]){
                bfs(adj, vis, i);
                provinces++;
            }
        }

        return provinces;
    }

    private void bfs(int[][] adj, boolean[] vis, int i){
        int n = adj.length;
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        vis[i] = true;

        while(!q.isEmpty()){
            int front = q.remove();
            for(int j=0; j<n; j++){
                if(adj[front][j] == 1 && vis[j]==false){
                    vis[j] = true;
                    q.add(j);
                }
            }
        }
    }
}
