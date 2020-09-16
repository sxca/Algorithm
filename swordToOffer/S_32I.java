import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class S_32I {
    public int[] levelOrder(TreeNode root) {
        if (root == null) {
            return new int[0];
        }
        int i = 0;
        Queue<TreeNode> q = new LinkedList<>();
        ArrayList<TreeNode> a = new ArrayList<>();
        a.add(root);
        q.offer(root);
        while (!q.isEmpty()) {
            root = q.poll();
            if (root.left != null) {
                a.add(root.left);
                q.offer(root.left);
            }
            if (root.right != null) {
                a.add(root.right);
                q.offer(root.right);
            }
        }
        int[] res = new int[a.size()];

        for (TreeNode temp: a) {
            res[i++] = temp.val;
        }
        return res;
    }
}
