public class S_66 {
    public int[] constructArr(int[] a) {
        if (a.length == 0) {
            return new int[0];
        }
        int[] c = new int[a.length];
        c[0] = 1;
        for (int i = 1; i < a.length; i++) {
            c[i] = c[i - 1] * a[i - 1];
        }
        // temp表示右边的乘积和
        int temp = a[a.length - 1];
        int res;
        a[a.length - 1] = c[a.length - 1];
        for (int i = a.length - 2; i >= 0; i--) {
            res = c[i] * temp;
            temp *= a[i];
            a[i] = res;
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,5};
        a = new S_66().constructArr(a);
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        System.out.println(a[4]);
    }
}
