import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIslands {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int islands = 0;

        boolean[][] vis = new boolean[n][m];

        // traverse entire grid
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){

                // if unvisited land → start BFS
                if(!vis[i][j] && grid[i][j] == '1'){
                    bfs(grid, vis, i, j);
                    islands++;   // completed one island
                }
            }
        }

        return islands;
    }

    // helper class for coordinates
    public class Pair{
        int row, col;
        Pair(int r, int c){
            this.row = r;
            this.col = c;
        }
    }

    private void bfs(char[][] grid, boolean[][] vis, int r, int c){
        Queue<Pair> q = new LinkedList<>();

        q.add(new Pair(r, c));
        vis[r][c] = true;

        int n = grid.length;
        int m = grid[0].length;

        while(!q.isEmpty()){

            Pair front = q.remove();

            int i = front.row;
            int j = front.col;

            // explore 4 directions

            // top
            if(i > 0 && grid[i-1][j] == '1' && !vis[i-1][j]){
                vis[i-1][j] = true;
                q.add(new Pair(i-1, j));
            }

            // down
            if(i + 1 < n && grid[i+1][j] == '1' && !vis[i+1][j]){
                vis[i+1][j] = true;
                q.add(new Pair(i+1, j));
            }

            // left
            if(j > 0 && grid[i][j-1] == '1' && !vis[i][j-1]){
                vis[i][j-1] = true;
                q.add(new Pair(i, j-1));
            }

            // right
            if(j + 1 < m && grid[i][j+1] == '1' && !vis[i][j+1]){
                vis[i][j+1] = true;
                q.add(new Pair(i, j+1));
            }
        }
    }
}
