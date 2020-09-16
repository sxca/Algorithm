import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author SXC
 * @Date 2020/9/15 16:20
 **/
public class S_34 {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<>();
        LinkedList<Integer> in = new LinkedList<>();
        recur(root, sum, res, in);
        return res;
    }

    public void recur(TreeNode root, int sum, List<List<Integer>> res, LinkedList<Integer> in) {
        if (root == null) {
            return;
        }

        in.add(root.val);
        sum -= root.val;

        if (sum == 0 && root.left == null && root.right == null) {
            res.add(new LinkedList<>(in));
        }
        recur(root.left, sum, res, in);
        recur(root.right, sum, res, in);
        in.pollLast();
    }
}
