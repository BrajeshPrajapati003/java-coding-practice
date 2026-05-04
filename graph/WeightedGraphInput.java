import java.util.ArrayList;
import java.util.Scanner;

public class WeightedGraphInput {
    static class Edge{
        int node, wt;

        public Edge(int node, int wt) {
            this.node = node;
            this.wt = wt;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        ArrayList<ArrayList<Edge>> graph = new ArrayList<>();

        for(int i=0; i<=n; i++){
            graph.add(new ArrayList<>());
        }


        for(int i=0; i<m; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();

            graph.get(u).add(new Edge(v, w));
            graph.get(v).add(new Edge(u, w)); // remove if directed
        }

        sc.close();
    }
}




