import javax.print.attribute.standard.PresentationDirection;
import java.util.LinkedList;
import java.util.List;

public class S_54 {
    private int i, res;

    public int kthLargest(TreeNode root, int k) {
        this.i = k;
        dfs(root);
        return res;
    }

    public  void dfs(TreeNode root) {
        if (root != null) {
            dfs(root.right);
            if (i == 1) {
                this.res = root.val;
            } else {
                i--;
                return;
            }
            dfs(root.left);
        }
    }

}
