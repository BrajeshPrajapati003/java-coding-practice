import java.util.ArrayList;
import java.util.Scanner;

public class UnweightedGraphInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); // no. of nodes
        int m = sc.nextInt(); // no. of edges

        // adjacency list
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for(int i=0; i<=n; i++){ // n+1 for 1-based indexing
            graph.add(new ArrayList<>());
        }

        // input edges
        for(int i=0; i<m; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();

            graph.get(u).add(v);
            graph.get(v).add(u); // remove id directed
        }

        // print graph
        for(int i=1; i<=n; i++){
            System.out.println(i+"->");
            for(int nei: graph.get(i)){
                System.out.print(nei+" ");
            }
            System.out.println();
        }

        sc.close();
    }
}
