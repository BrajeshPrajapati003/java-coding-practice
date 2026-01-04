
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Classroom{

    // Edge class to store a connection from src -> dest
    public static class Edge{
        int src, dest;

        Edge(int src, int dest){
            this.src = src;
            this.dest = dest;
        }
    }

    // Create the graph
    public static void createGraph(ArrayList<Edge>[] graph){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        // Add edges
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 2));
    }

    // Print the adjacency list
    public static void printGraph(ArrayList<Edge>[] graph){
        for(int i=0; i<graph.length; i++){
            System.out.print(i + " -> ");
            for(Edge e: graph[i]){
                System.out.print(e.dest + " ");
            }
            System.out.println();
        }
    }

    // Inefficient BFS

    public static void bfs(ArrayList<Edge>[] graph, int V){
        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[V];
        q.add(0);

        while(!q.isEmpty()){
            int curr = q.remove();
            if(vis[curr] == false){
                System.out.print(curr + " ");
                vis[curr] = true;

                for(int i=0; i<graph[curr].size(); i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
        System.out.println();
    }

    // More Efficient BFS

    public static void efficientBfs(ArrayList<Edge>[] graph, int start, int V){
        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[V];

        q.add(start);
        vis[start] = true; // Mark when enqueueing - key optimization

        while(!q.isEmpty()){
            int curr = q.remove();
            System.out.print(curr + " ");
            for(Edge e: graph[curr]){
                if(!vis[e.dest]){
                    vis[e.dest] = true;
                    q.add(e.dest);
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge>[] graph = new ArrayList[V];

        createGraph(graph);
        printGraph(graph);
        System.out.println();

        System.out.println("Less Efficient BFS:");
        bfs(graph, V);

        System.out.println("More Efficient BFS:");
        efficientBfs(graph, 0, V);
    }
}