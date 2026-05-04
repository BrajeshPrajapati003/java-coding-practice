
import java.util.List;

public class DFS {
    public void dfs(int node, List<List<Integer>> graph, boolean[] vis){

        vis[node] = true;
        System.out.print(node + " ");
        
        for(int nei: graph.get(node)){
            if(!vis[nei]){
                dfs(nei, graph, vis);
            }
        }
    }
}
