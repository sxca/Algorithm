/**
 * @author SXC
 * @date 2020/9/23 8:56
 */
public class S_42 {
    public int maxSubArray(int[] nums) {
        int max;
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        max = dp[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = dp[i-1]<0 ? nums[i] : dp[i-1]+nums[i];
            // dp[i] = Math.max(dp[i-1] + nums[i], nums[i]);
            if (max < dp[i]) {
                max = dp[i];
            }
        }
        return max;
    }
}
