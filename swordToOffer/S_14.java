public class S_14 {
    public int cuttingRope(int n) {
        if (n == 2)
            return 1;
        if (n == 3)
            return 2;
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;
        int temp;
        for (int i = 4; i <= n; i++) {
            int max = 0;
            for (int j = 1; j <= i/2; j++) {
                temp = dp[j] * dp[i-j] % 1000000007;
                if (max < temp)
                    max = temp;
            }
            dp[i] = max;
        }
        return dp[n];
    }

    public static void main(String[] args) {
        S_14 s = new S_14();
        System.out.println(s.cuttingRope(10));
    }
}
