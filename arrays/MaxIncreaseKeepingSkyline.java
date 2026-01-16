import java.util.Scanner;

public class MaxIncreaseKeepingSkyline {

    public static int maxIncreaseKeepingSkyline(int[][] grid){
        int len = grid.length;
        int[] rowMax = new int[len];
        int[] colMax = new int[len];

        // Find row and col max in one pass
        for(int i=0; i<len; i++){
            for(int j=0; j<len; j++){
                rowMax[i] = Math.max(rowMax[i], grid[i][j]);
                colMax[j] = Math.max(colMax[j], grid[i][j]);
            }
        }

        int ans = 0;
        // Find max increase
        for (int i = 0; i < len; i++) {
            for(int j=0; j<len; j++){
                ans += Math.min(rowMax[i], colMax[j]) - grid[i][j];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt(); // grid size
            int[][] grid = new int[n][n];

            // Input grid
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    grid[i][j] = sc.nextInt();
                }
            }

            int result = maxIncreaseKeepingSkyline(grid);
            System.out.println(result);
        }
    }
}
