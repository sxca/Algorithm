import java.util.Deque;
import java.util.LinkedList;

public class S_59 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0) {
            return new int[0];
        }
        int[] res = new int[nums.length - k + 1];
        Deque<Integer> q = new LinkedList<>();
        for (int i = 0; i < k; i++) {
            while (!q.isEmpty() && q.peekLast() < nums[i]) {
                q.removeLast();
            }
            q.addLast(nums[i]);
        }
        int t = 0;
        res[t++] = q.peekFirst();

        for (int i = k; i < nums.length; i++) {
            if (nums[i - k] == q.peekFirst()) {
                q.removeFirst();
            }
            while (!q.isEmpty() && q.peekLast() < nums[i]) {
                q.removeLast();
            }
            q.addLast(nums[i]);
            res[t++] = q.peekFirst();
        }
        return res;
    }
}
