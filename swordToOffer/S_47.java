import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

public class S_47 {
    public int maxValue(int[][] grid) {
        int[][] dp =new int[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (dp[i][j] == 0) {
                    if (i == 0 && j == 0) {
                        dp[i][j] = grid[i][j];
                    } else if (i >= 1 && j >= 1) {
                        dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j])+ grid[i][j];
                    } else {
                        dp[i][j] = i<1 ? dp[i][j - 1] +  grid[i][j] : dp[i - 1][j] + grid[i][j];
                    }
                }

            }
        }
        return dp[grid.length-1][grid[0].length-1];
    }

    public static void main(String[] args) {
        int[][] grid = new int[][]{{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(new S_47().maxValue(grid));
        /*if (grid[0][0] == 0) {
            System.out.println(grid[0][0]);
        }*/
    }
}
