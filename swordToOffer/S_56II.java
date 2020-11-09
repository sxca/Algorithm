public class S_56II {
    public int singleNumber(int[] nums) {
        int[] c = new int[32];
        for (int num: nums) {
            for (int i = 0; i < 32; i++) {
                c[i] += num & 1;
                num >>>= 1;
            }
        }
        int res = 0;
        for (int i = 0; i < 32; i++) {
            res += c[31 - i] % 3;
            res <<= 1;
        }
        return res>>>1;
    }

    public static void main(String[] args) {
        int[] num1 = new int[]{3,4,3,3};
        int[] num2 = new int[]{9,1,7,9,7,9,7};
        System.out.println(new S_56II().singleNumber(num1));
        System.out.println(new S_56II().singleNumber(num2));
    }
}
