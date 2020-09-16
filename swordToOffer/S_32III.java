import sun.reflect.generics.tree.Tree;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author SXC
 * @Date 2020/9/14 20:55
 **/
public class S_32III {
    public List<List<Integer>> levelOrder(TreeNode root) {
        LinkedList<TreeNode> q = new LinkedList<>();
        q.offer(root);
        List<List<Integer>> res = new ArrayList<>();
        LinkedList<Integer> in;
        if (root == null) {
            return res;
        }
        int flag = 1;
        while (!q.isEmpty()) {
            in = new LinkedList<>();
            int l = q.size();
            if (flag % 2 == 1) {
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
                flag++;
            } else {
                for (int i = 0; i < l; i++) {
                    root = q.poll();
                    in.offerFirst(root.val);
                    if (root.left != null) {
                        q.offer(root.left);
                    }
                    if (root.right != null) {
                        q.offer(root.right);
                    }
                }
                flag++;
            }
            res.add(in);
        }
        return res;
    }
}
