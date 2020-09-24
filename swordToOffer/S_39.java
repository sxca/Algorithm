import java.util.HashMap;

/**
 * @author SXC
 * @date 2020/9/21 9:51
 */
public class S_39 {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i],map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        int res=nums[0],maxNum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) > maxNum) {
                maxNum = map.get(nums[i]);
                res = nums[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 2, 2, 2, 5, 4, 2};
        System.out.println(new S_39().majorityElement(a));
    }
}
