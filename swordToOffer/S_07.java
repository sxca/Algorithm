import java.util.HashMap;
import java.util.Map;

public class S_07 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            //map的作用是为了找出中序遍历中的根节点的索引
            map.put(inorder[i],i);
        }
        return build(0,0,preorder.length-1,preorder,map);
    }

    /**
     *
     * @param root_idx_preorder  根节点在先序遍历中的索引
     * @param left  构建的左边索引
     * @param right 构建的右边索引
     * @param preorder  先序遍历的结果
     * @param map   中序遍历的结果
     * @return 根节点
     */
    private TreeNode build(int root_idx_preorder, int left, int right, int[] preorder, Map<Integer, Integer> map) {
        if (left > right)
            return null;
        TreeNode root = new TreeNode(preorder[root_idx_preorder]);
        int root_idx_inorder = map.get(preorder[root_idx_preorder]);
        root.left = build(root_idx_preorder+1, left, root_idx_inorder-1 , preorder, map);
        root.right = build(root_idx_preorder+root_idx_inorder-left+1,root_idx_inorder+1,
                right,preorder,map);
        return root;
    }
}
