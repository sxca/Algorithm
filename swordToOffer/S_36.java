/**
 * @author SXC
 * @date 2020/9/17 20:13
 */
public class S_36 {
    public Node treeToDoublyList(Node root) {
        Node pre = null;
        Node head = null;
        if (root == null) {
            return null;
        }
        dfs(root, pre, head);

        head.left = pre;
        pre.right = head;
        return head;
    }

    void dfs(Node root, Node pre, Node head) {
        if (root != null) {
            dfs(root.left,pre,head);
            if (pre == null) {
                head = root;
            } else {
                root.left = pre;
                pre.right = root;
            }
            pre = root;
            dfs(root.right,pre,head);
        }
    }

    void testNode() {
        Node node = new Node(9);
        System.out.println("在testNode方法中node的值为"+node.val);
        changeNode(node);
        System.out.println("执行完changeNode方法后node的值为"+node.val);
    }

    void changeNode(Node node) {
        node = null;
        // System.out.println("在changeNode方法中node的值为"+node.val);
    }

    public static void main(String[] args) {
        new S_36().testNode();
    }
}
