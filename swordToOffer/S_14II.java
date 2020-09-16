public class S_14II {
    public int cuttingRope(int n) {
        if (n == 2)
            return 1;
        if (n == 3)
            return 2;
        long res=1;
        // 下面循环后，n的最小值是2
        while (n > 4) {
            res *= 3;
            res %= 1000000007;
            n -= 3;
        }
        res = (res * n)%1000000007;
        return (int)res;
    }

    public static void main(String[] args) {
        System.out.println(new S_14II().cuttingRope(120));
    }
}
