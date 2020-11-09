public class S_53II {
    public int missingNumber(int[] nums) {
        int i = 0, j = nums.length - 1;
        int m;
        while (i <= j) {
            m = (i + j) / 2;
            if (m == nums[m]) {
                i = m + 1;
            } else {
                j = m - 1;
            }
        }
        return j + 1;
    }

    public static void main(String[] args) {
        int[] a = new int[]{0,1,3};
        int[] b = new int[]{0,1,2,3,4,5,6,7,9};
        System.out.println(new S_53II().missingNumber(a));
        System.out.println(new S_53II().missingNumber(b));
    }
}
