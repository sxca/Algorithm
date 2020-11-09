public class S_53 {
    public int search(int[] nums, int target) {
        int right, left;
        int l = 0, r = nums.length - 1;
        int mid;
        while (l <= r) {
            mid = (l + r) / 2;
            if (nums[mid] <= target) {
                // 如果相等，那么就一直向右走，最后找的是该数的右端点
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        // 最后的情况是 l和r指向同一个元素 且在target元素的右边（如果存在）
        // 此时肯定nums[mid]>target，那么r=mid-1,这时候r正好指向最右侧的元素，此时也不满足while循环的条件
        right = r;
        if (r >= 0 && nums[r] != target) {
            return 0;
        }
        l = 0;
        r = nums.length - 1;

        while (l <= r) {
            mid = (l + r) / 2;
            if (nums[mid] < target) {
                l = mid + 1;
            } else {
                // 如果相等，就一直往左边走
                r = mid - 1;
            }
        }
        // 最后的情况是 l和r指向同一个元素 且在target元素的左边（如果存在）
        // 此时肯定nums[mid]<target，那么l=mid+1,这时候l正好指向最左侧的元素，此时也不满足while循环的条件
        left = l;
        return right - left + 1;
    }


    public static void main(String[] args) {
        int[] a = new int[]{5,7,7,8,8,10};
        System.out.println(new S_53().search(a, 8));
    }
}
