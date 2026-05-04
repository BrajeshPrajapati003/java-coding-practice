
import java.util.ArrayList;
import java.util.List;

public class GraphList {
    int n; // nodes
    List<List<Integer>> graph;

    public GraphList(int n) {
        this.n = n;
        graph = new ArrayList<>();

        for(int i=0; i<n; i++){
            graph.add(new ArrayList<>());
        }
    }

    void addEdges(int u, int v){
        graph.get(u).add(v);
        graph.get(v).add(u); // for undirected graph
    }

    void print(){
        for(int i=0; i<n; i++){
            System.out.println(graph.get(i)+"-> ");
            for(int nei: graph.get(i))
                System.out.print(nei+" ");
            System.out.println();
        }
    }
}
