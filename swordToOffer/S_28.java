public class S_28 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isSym(root.left,root.right);
    }

    private boolean isSym(TreeNode l1, TreeNode l2) {
        if (l1 == null && l2 == null) {
            return true;
        }
        if (l1 == null || l2 == null) {
            return false;
        }

        if (l1.val != l2.val) {
            return false;
        }
        return isSym(l1.left, l2.right) && isSym(l1.right, l2.left);
    }
}
