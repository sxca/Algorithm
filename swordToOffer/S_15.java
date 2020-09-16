public class S_15 {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int res=0;
        while (n!=0) {
            res += n&2;
            n=n>>>1;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(5|3);
    }
}
