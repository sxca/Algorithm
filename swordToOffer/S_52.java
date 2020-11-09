public class S_52 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int la = 0, lb = 0;
        ListNode a = headA, b = headB;
        while (a != null) {
            la++;
            a = a.next;
        }
        while (b != null) {
            lb++;
            b = b.next;
        }

        if (la > lb) {
            for (int i = 0; i < la - lb; i++) {
                headA = headA.next;
            }
        } else {
            for (int i = 0; i < lb - la; i++) {
                headB = headB.next;
            }
        }

        while (headA != null) {
            if (headA == headB) {
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
}
