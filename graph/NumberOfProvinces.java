
import java.util.LinkedList;
import java.util.Queue;

public class NumberOfProvinces {
    public int findCircleNum(int[][] adj) {
        int n = adj.length; // no. of cities (nodes)
        int provinces = 0; // no. of provinces (connected components)
        boolean[] vis = new boolean[n]; // to track visited cities

        for(int i=0; i<n; i++){
            // If the city isn't visited, it belongs to a new province
            if(!vis[i]){
                // perform BFS to visit all cities in this province
                bfs(i, vis, adj);
                provinces++;
            }
        }

        return provinces;
    }

    // explore all connected cities
    private void bfs(int i, boolean[] vis, int[][] adj){
        int n = adj.length;
        Queue<Integer> q = new LinkedList<>();

        // add starting city to Q
        q.add(i);
        // mark starting city as visited
        vis[i] = true;

        while(!q.isEmpty()){
            // remove front city
            int front = q.remove();

            // check all possible neighbours of this city
            for(int j=0; j<n; j++){
                if(adj[front][j] == 1 && vis[j] == false){
                    // add neighbour to Q
                    q.add(j);
                    // mark neighbour as visited
                    vis[j] = true;
                }
            }
        }
    }
}
