
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {
    public void bfs(int start, List<List<Integer>> graph, int n){
        boolean[] vis = new boolean[n];
        Queue<Integer> q = new LinkedList<>();

        // push start node
        q.add(start);
        vis[start] = true;

        while(!q.isEmpty()){
            int front = q.poll();
            System.out.print(front+" ");

            // explore neighbors
            for(int nei: graph.get(front)){
                if(!vis[nei]){
                    vis[nei] = true; // mark BEFORE adding
                    q.add(nei);
                }
            }
            System.out.println();
            
        }
    }
}
