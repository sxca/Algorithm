public class S_60 {
    public double[] twoSum(int n) {
        int[][] dp = new int[15][70];
        for (int j = 1; j <= 6; j++) {
            dp[1][j] = 1;
        }
        for (int i = 2; i <= n; i++) {
            for (int j = 2 * i; j >= i; j++) {
                for (int k = 1; k <= 6; k++) {
                    if (j - k > 0) {
                        dp[i][j] += dp[i-1][j-k];
                    }
                }
            }

        }
        int sum = 0;
        for (int i = n; i <= 6 * n; i++) {
            sum += dp[n][i];
        }
        double[] res = new double[6*n-n+1];
        for (int i = n, j = 0; i <= 6 * n; i++) {
            res[j++] = dp[n][i]*1.0/sum;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new S_60().twoSum(2));
    }
}
