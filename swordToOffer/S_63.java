public class S_63 {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int[] b = new int[prices.length];
        int[] m = new int[prices.length];
        b[0] = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < b[i - 1]) {
                b[i] = prices[i];
            } else {
                b[i] = b[i - 1];
            }
        }
        m[prices.length - 1] = prices[prices.length - 1];
        for (int i = prices.length - 2; i >= 0; i--) {
            if (prices[i] > m[i + 1]) {
                m[i] = prices[i];
            } else {
                m[i] = m[i + 1];
            }
        }

        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            if (m[i] - b[i] > 0 && m[i] - b[i] > max) {
                max = m[i] - b[i];
            }
        }
        return max;
    }


}
