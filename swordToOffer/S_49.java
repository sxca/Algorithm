import com.sun.xml.internal.ws.encoding.MtomCodec;

public class S_49 {
    public int nthUglyNumber(int n) {
        int[] dp = new int[n];
        dp[0] = 1;
        int a, b, c;
        a = b = c = 0;
        int n1, n2, n3;
        for (int i = 1; i < n; i++) {
            n1 = dp[a] * 2;
            n2 = dp[b] * 3;
            n3 = dp[c] * 5;
            // 求出三个当中最小的一个数
            dp[i] = Math.min(Math.min(n1, n2), n3);

            // 因为是最小的一个数，其他两个乘相应的系数照样大于dp[i],所以只需要修改最小的那个数就可以了。
            if (dp[i] == n1) {
                a++;
            }
            if (dp[i] == n2) {
                b++;
            }
            if (dp[i] == n3) {
                c++;
            }
        }
        return dp[n-1];
    }

}
