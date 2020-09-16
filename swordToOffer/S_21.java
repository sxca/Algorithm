public class S_21 {
    public int[] exchange(int[] nums) {
        int temp;
        int i = 0, j = nums.length - 1;
        while (i < j) {
            while (isOdd(nums[i]) && i < j) {
                i++;
            }

            while (!isOdd(nums[j]) && i < j) {
                j--;
            }
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j++;
        }
        return nums;
    }

    private boolean isOdd(int a) {
        if ((a & 1 )== 1) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4};
        a = new S_21().exchange(a);
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
    }
}
