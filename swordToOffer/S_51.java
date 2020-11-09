public class S_51 {
    public int reversePairs(int[] nums) {
        int res = 0;
        int l = nums.length;
        for (int i = 0; i < l; i++) {
            for (int j = i + 1; j < l; j++) {
                if (nums[i] > nums[j]) {
                    res++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = new int[]{7,5,6,4};
        System.out.println(new S_51().reversePairs(a));
    }
}
