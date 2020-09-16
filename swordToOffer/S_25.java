import java.net.InetSocketAddress;
import java.util.List;

public class S_25 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode res;
        ListNode head = new ListNode(0);
        res = head;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                res.next = l1;
                l1 = l1.next;
            } else {
                res.next = l2;
                l2 = l2.next;
            }
            res = res.next;
        }
        if (l1 != null) res.next = l1;
        if (l2 != null) res.next = l2;
        return head.next;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(4);
        a.next = b;
        b.next = c;
        c.next = null;

        ListNode d = new ListNode(1);
        ListNode e = new ListNode(3);
        ListNode f = new ListNode(4);
        d.next = e;
        e.next = f;
        f.next = null;

        ListNode res = new S_25().mergeTwoLists(a, d);
        System.out.println(res.next.next.val);
    }
}
