
import java.util.List;

public class CycleDetection_UndirectedGraph {
    boolean dfs(int node, int parent, boolean[] vis, List<List<Integer>> graph){

        vis[node] = true;

        for(int nei: graph.get(node)){

            // if neighbor not visited -> go deeper
            if(!vis[nei]){
                if(dfs(nei, node, vis, graph)) 
                    return true;
            }
            // if visited & not parent -> cycle
            else if(nei != parent) 
                return true; // cycle found
        }
        return false;
    }

    boolean hasCycle(int n, List<List<Integer>> graph){
        boolean[] vis = new boolean[n];

        for(int i=1; i<=n; i++){
            if(!vis[i]){
                if(dfs(i, -1, vis, graph))
                    return true;
            }
        }
        return false;
    }
}
