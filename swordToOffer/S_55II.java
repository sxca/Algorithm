public class S_55II {
    public boolean isBalanced(TreeNode root) {
        if (root != null) {
            int a = maxDepth(root.left);
            int b = maxDepth(root.right);
            if (Math.abs(a-b) <= 1) {
                return isBalanced(root.left) && isBalanced(root.right);
            }
            return false;
        }
        return true;
    }

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
