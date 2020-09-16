public class S_27 {
    public TreeNode mirrorTree(TreeNode root) {
        if (root != null) {
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;

            root.left = mirrorTree(root.left);
            root.right = mirrorTree(root.right);
        }
        return root;
    }
}
