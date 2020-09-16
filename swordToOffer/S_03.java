import java.util.HashSet;
import java.util.Set;

public class S_03 {
    /**
     * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，
     * 但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    public int findRepeatNumber(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int num:nums){
            if (!set.add(num)){
                return num;
            }
        }
        return -1;
    }

    public int findRepeatNumber2(int[] nums) {
        int i = 0;
        int length = nums.length;
        int temp;
        while (i < length) {
            if (i != nums[i]) {
                if (nums[nums[i]] == nums[i])
                    return nums[i];
                temp = nums[nums[i]];
                nums[nums[i]] = nums[i];
                nums[i] = temp;
            } else {
                i++;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        a = b;
        System.out.println(a);
        int[] nums={2,3,1,0,2,5,3};
        S_03 s = new S_03();
        System.out.println(s.findRepeatNumber(nums));
        System.out.println(s.findRepeatNumber2(nums));
    }
}
