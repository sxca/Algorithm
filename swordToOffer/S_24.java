public class S_24 {
    public ListNode reverseList(ListNode head) {
        ListNode p = null, pre=head;
        while (head != null) {
            head = head.next;
            pre.next = p;
            p = pre;
            pre = head;
        }

        return p;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;
        a = new S_24().reverseList(a);
        System.out.println(a.next.val);
    }
}
