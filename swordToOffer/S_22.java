public class S_22 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode p = head;
        for (int i = 0; i < k; i++) {
            p = p.next;
        }
        while (p != null) {
            p = p.next;
            head = head.next;
        }
        return head;
    }
}
