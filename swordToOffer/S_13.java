import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class S_13 {
    private int digitSum(int x) {
        int sum=0;
        while (x!=0){
            sum += x%10;
            x = x/10;
        }
        return sum;
    }

    /*public int movingCount(int m, int n, int k) {
        boolean[][] visited = new boolean[m][n];
        int res=0;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0,0});
        while (!queue.isEmpty()) {
            int[] x = queue.poll();
            int i = x[0], j = x[1];
            if (i>=m||j>=n||digitSum(i)+digitSum(j)>k||visited[i][j])
                continue;
            visited[i][j] = true;
            res++;
            queue.add(new int[]{i+1,j});
            queue.add(new int[]{i,j+1});
        }
        return res;
    }*/

    public int movingCount(int m, int n, int k) {
        boolean[][] visited = new boolean[m][n];

        return dfs(0,0,m,n,visited,k);
    }

    private int dfs(int i, int j, int m, int n, boolean[][] visited, int k) {
        if (i>=m||i<0||j>=n||j<0||digitSum(i)+digitSum(j)>k||visited[i][j]) {
            return 0;
        }
        visited[i][j] = true;
        return 1+dfs(i+1,j,m,n,visited,k)+dfs(i,j+1,m,n,visited,k);
    }

    public static void main(String[] args) {
        S_13 s = new S_13();
        System.out.println(s.movingCount(3,2,17));
        System.out.println(s.movingCount(2,3,1));
        System.out.println(s.movingCount(3,1,0));
    }
}
