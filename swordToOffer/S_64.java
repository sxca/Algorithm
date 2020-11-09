public class S_64 {
    private int res;
    public int sumNums(int n) {
        boolean flag = ( n > 1 ) && (res = n + sumNums(n - 1)) > 0;
        return res;
    }
}
