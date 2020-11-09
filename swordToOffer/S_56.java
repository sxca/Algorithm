public class S_56 {
    public int[] singleNumbers(int[] nums) {
        int res = 0;
        for (int num : nums) {
            res = res ^ num;
        }
        int k = 1;
        while ((res & 1) == 0) {
            k <<= 1;
            res >>= 1;
        }
        int a = 0;
        int b = 0;
        for (int num : nums) {
            if ((num & k) == 0) {
                a ^= num;
            } else {
                b ^= num;
            }
        }
        return new int[]{a, b};
    }

    public static void main(String[] args) {
        int[] a = new int[]{4,1,4,6};
        a = new S_56().singleNumbers(a);
        System.out.println(a[0]);
        System.out.println(a[1]);

        int[] b = new int[]{1,2,10,4,1,4,3,3};
        b = new S_56().singleNumbers(b);
        System.out.println(b[0]);
        System.out.println(b[1]);
    }
}
