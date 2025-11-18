import java.util.*;

public class Graph {
    private final Map<Integer, List<Edge>> adjList;
    private final boolean isDirected;

    // Edge class for representing weighted/unweighted edges
    static class Edge {
        int dest;
        int weight;

        Edge(int dest, int weight) {
            this.dest = dest;
            this.weight = weight;
        }

        @Override
        public String toString() {
            return weight == 1 ? String.valueOf(dest) : dest + "(" + weight + ")";
        }
    }

    // Constructor
    public Graph(boolean isDirected) {
        this.adjList = new HashMap<>();
        this.isDirected = isDirected;
    }

    // Add a vertex
    public void addVertex(int vertex) {
        adjList.putIfAbsent(vertex, new ArrayList<>());
    }

    // Add an edge (supports weighted + unweighted)
    public void addEdge(int src, int dest) {
        addEdge(src, dest, 1);
    }

    public void addEdge(int src, int dest, int weight) {
        addVertex(src);
        addVertex(dest);

        adjList.get(src).add(new Edge(dest, weight));

        // If undirected, add reverse edge
        if (!isDirected) {
            adjList.get(dest).add(new Edge(src, weight));
        }
    }

    // Print graph
    public void printGraph() {
        for (var vertex : adjList.keySet()) {
            System.out.println(vertex + " -> " + adjList.get(vertex));
        }
    }

    // BFS traversal
    public void bfs(int start) {
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        queue.add(start);
        visited.add(start);

        System.out.print("BFS: ");
        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");

            for (Edge edge : adjList.get(node)) {
                if (!visited.contains(edge.dest)) {
                    visited.add(edge.dest);
                    queue.add(edge.dest);
                }
            }
        }
        System.out.println();
    }

    // DFS traversal
    public void dfs(int start) {
        Set<Integer> visited = new HashSet<>();
        System.out.print("DFS: ");
        dfsHelper(start, visited);
        System.out.println();
    }

    private void dfsHelper(int node, Set<Integer> visited) {
        visited.add(node);
        System.out.print(node + " ");

        for (Edge edge : adjList.get(node)) {
            if (!visited.contains(edge.dest)) {
                dfsHelper(edge.dest, visited);
            }
        }
    }

    // Get adjacency list (optional for external use)
    public Map<Integer, List<Edge>> getAdjList() {
        return adjList;
    }
}
