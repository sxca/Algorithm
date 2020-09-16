import java.util.LinkedList;
import java.util.List;

public class S_29 {
    public int[] spiralOrder(int[][] matrix) {
        if (matrix.length == 0)
            return new int[0];
        int m = matrix.length;
        int n = matrix[0].length;
        int[] res = new int[m * n];
        int[][] visited = new int[m][n];
        int k = 0, i = 0, j = 0;
        res[k++] = matrix[i][j];
        visited[i][j] = 1;
        while (k < m * n) {
            while (j + 1 < n && visited[i][j + 1] == 0) {
                res[k++] = matrix[i][++j];
            }
            while (i + 1 < m && visited[i + 1][j] == 0) {
                res[k++] = matrix[++i][j];
            }
            while (j - 1 >= 0 && visited[i][j - 1] == 0) {
                res[k++] = matrix[i][--j];
            }
            while (i - 1 >= 0 && visited[i - 1][j] == 0) {
                res[k++] = matrix[--i][j];
            }
        }
        return res;
    }




}
