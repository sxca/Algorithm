public class S_16 {
    public double myPow(double x, int n) {
        if (n==0) {
            return 1;
        }
        double res = 1;
        if (n < 0) {
            n = -(n+1);
            res = 1/x;
            x = 1/x;
        }
        if (n==0) {
            return res;
        }
        while (n > 1) {
            if (n%2 == 1) {
                n = n - 1;
                res = res * x;
            } else {
                n = n/2;
                x = x * x;
            }
        }
        return res * x;
    }

    public static void main(String[] args) {
        System.out.println(new S_16().myPow(2.0,10));
        System.out.println(new S_16().myPow(2.0,-2));
        System.out.println(new S_16().myPow(2.1,3));
        System.out.println(new S_16().myPow(2.0, -2147483648));
    }
}
