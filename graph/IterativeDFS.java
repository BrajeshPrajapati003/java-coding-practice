
import java.util.List;
import java.util.Stack;

public class IterativeDFS {
    public void iterativeDFS(int start, List<List<Integer>> graph, boolean[] vis){
        
        vis[start] = true;
        Stack<Integer> st = new Stack<>();
        st.push(start);

        while(!st.isEmpty()){

            int node = st.pop();
            if(vis[node]) continue;

            vis[node] = true;
            System.out.print(node + " ");

            for(int nei: graph.get(node)){
                if(!vis[nei]){
                    st.push(nei);
                }
            }
        }
    }
}
