
import java.util.ArrayList;

public class GraphImpl {
    
    public static class Edge{
        int src, dest;

        public Edge(int src, int dest){
            this.src = src;
            this.dest = dest;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph){

        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 3));
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));
    }

    public static void printGraph(ArrayList<Edge>[] graph){
        for(int i=0; i<graph.length; i++){
            System.out.print(i + " -> ");
            for(Edge e: graph[i]) System.out.print(e.dest + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int V = 3;
        ArrayList<Edge>[] graph = new ArrayList[V];

        createGraph(graph);
        printGraph(graph);
    }
}
