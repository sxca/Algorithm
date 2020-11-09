import java.util.Arrays;

public class S_61 {
    public boolean isStraight(int[] nums) {
        Arrays.sort(nums);
        int s = 0;
        int any = 0;
        if (nums[0] == 0) {
            any++;
        }
        if (nums[1] == 0) {
            any++;
        }
        for (int i = 1; i < 5; i++) {
            if (nums[i - 1] == 0) {
                continue;
            }
            if (nums[i] == nums[i - 1]) {
                return false;
            }
            if (nums[i] - nums[i - 1] != 1) {
                s += nums[i] - nums[i - 1] - 1;
            }
        }
        if (s <= any) {
            return true;
        } else {
            return false;
        }
    }
}
