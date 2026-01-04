
import java.util.ArrayList;

class Edge{
    int source, destination;
    // for weighted graphs
    int weight;

    public Edge(int src, int dest){
        this.source = src;
        this.destination = dest;
    }
}

public class Graph2 {
    private int V;
    private ArrayList<Edge>[] adjList;

    @SuppressWarnings("unchecked")
    public Graph2(int V){
        this.V = V;
        adjList = new ArrayList[V];
        for(int i=0; i<V; i++){
            adjList[i] = new ArrayList<>();
        }
    }

    // Add edge to undirected graph
    public void addEdge(int u, int v){
        adjList[u].add(new Edge(u, v));
        adjList[v].add(new Edge(v, u));
    }

    // Add edge to directed graph
    public void addDirectedEdge(int u, int v){
        adjList[u].add(new Edge(u, v));
    }

    // Print the graph
    public void printGraph(){
        for (int i = 0; i < V; i++) {
            System.out.print("Verted " + i + " is connected to: ");
            for(Edge edge: adjList[i]){
                System.out.print(edge.destination + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Graph2 graph = new Graph2(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        graph.printGraph();
    }
}
