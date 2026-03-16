
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

// package graph;

public class GraphImpl2 {
    public class Edge{
        int src, dest;
        public Edge(int src, int dest){
            this.src = src;
            this.dest = dest; 
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph, int V){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }
    }

    public static void bfs(ArrayList<Edge>[] graph, int V, boolean[] vis, int start){
        Queue<Integer> q = new LinkedList<>();
        
        q.add(start);
        while(!q.isEmpty()){
            int curr = q.remove();

            if(!vis[curr]){
                System.out.print(curr+ " ");
                vis[curr] = true;

                for(int i=0; i<graph[curr].size(); i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    public static void main(String[] args) {
        int V = 7;
        ArrayList<Edge>[] graph = new ArrayList[V];

        createGraph(graph, V);

        boolean[] vis = new boolean[V];
        for(int i=0; i<V; i++){
            bfs(graph, V, vis, i);
        }

    }
}
