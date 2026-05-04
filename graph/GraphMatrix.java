public class GraphMatrix {
    int n;
    int[][] graph;

    public GraphMatrix(int n) {
        this.n = n;
        graph = new int[n][n];
    }

    // add Edges
    void addEdges(int u, int v){
        graph[u][v] = 1;
        graph[v][u] = 1; // for undirected graphs
    }

    void print(){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
    }
}
