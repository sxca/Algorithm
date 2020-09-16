public class S_10 {
    public int fib(int n) {
        int a = 0;
        int b = 0;
        int c = 1;
        for (int i = 1 ; i <=n;i++) {

            a = b;
            b = c;
            c = (a + b)%1000000007;
        }
        return c;
    }


    public static void main(String[] args) {
        S_10 s = new S_10();
        System.out.println(s.fib(5));
        System.out.println(1e-7);
    }
}
