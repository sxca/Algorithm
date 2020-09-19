import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author SXC
 * @date 2020/9/18 9:30
 */
public class S_37 {
    private int i = 0;
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) {
            return "";
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        String res = "[";
        boolean first = true;
        while (!q.isEmpty()) {
            root = q.poll();
            if (!first) {
                res +=",";
            } else {
                first = false;
            }
            if (root == null) {
                res += "null";
                continue;
            }
            else {
                res += "" + root.val;
            }
            q.add(root.left);
            q.add(root.right);
        }

        while (res.endsWith(",null")) {
            res = res.substring(0,res.length() - 5);
        }
        return res += "]";
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data == "") {
            return null;
        }
        String[] split = data.split(",");
        split[0] = split[0].substring(1);
        split[split.length - 1] = split[split.length - 1].substring(0,split[split.length - 1].length() - 1);
        TreeNode head = createTreeNode(split);
        return head;
    }

    public TreeNode createTreeNode(String[] split) {
        Queue<TreeNode> q = new LinkedList<>();
        TreeNode head = new TreeNode(Integer.parseInt(split[i++]));
        TreeNode p;
        q.offer(head);
        while (i < split.length) {
            p = q.poll();
            if (p == null) {
                continue;
            }
            if ("null".equals(split[i])) {
                p.left = null;
                i++;
                if (i >= split.length) break;
            } else {
                p.left = new TreeNode(Integer.parseInt(split[i++]));
                if (i >= split.length) break;
            }

            if ("null".equals(split[i])) {
                p.right = null;
                i++;
                if (i >= split.length) break;
            } else {
                p.right = new TreeNode(Integer.parseInt(split[i++]));
            }
            q.offer(p.left);
            q.offer(p.right);
        }
        return head;
    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);

        a.left = b;
        System.out.println(new S_37().serialize(a));
        String data = new S_37().serialize(a);
        TreeNode head = new S_37().deserialize(data);
        System.out.println(head.val);
        System.out.println(head.left.val);
        StringBuilder sb = new StringBuilder();
        sb.append("[1,2,3,4,null,5,null,null]");
        System.out.println(sb.toString());
    }
}
