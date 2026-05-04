class Number_Of_Provinces_DFS {
    public int findCircleNum(int[][] adj) {
        int count = 0;
        int n = adj.length;
        boolean[] vis = new boolean[n];

        for(int i=0; i<n; i++){
            if(!vis[i]){
                dfs(adj, i, vis);
                count++;
            }
        }
        return count;
    }

    public void dfs(int[][] adj, int i, boolean[] vis){
        int n = adj.length;
        vis[i] = true;

        for(int j=0; j<n; j++){
            if(!vis[j] && adj[i][j]==1){
                dfs(adj, j, vis);
            }
        }
    }
}
