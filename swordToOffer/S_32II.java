import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author SXC
 */
public class S_32II {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> in;

        if (root == null) {
            return res;
        }
        q.offer(root);
        while (!q.isEmpty()) {
            in = new ArrayList<>();
            int l = q.size();
            for (int i = 0; i < l; i++) {
                root = q.poll();
                in.add(root.val);
                if (root.left != null) {
                    q.offer(root.left);
                }
                if (root.right != null) {
                    q.offer(root.right);
                }

            }
            res.add(in);
        }
        return res;
    }
}
