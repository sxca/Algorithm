public class S_06 {
    public int[] reversePrint(ListNode head) {
        StringBuilder sb = new StringBuilder();
        while (head!=null) {
            sb.insert(0,head.val);
            head = head.next;
        }
        int[] res = new int[sb.length()];
        for (int i = 0; i < sb.length(); i++) {
            res[i] = Integer.parseInt(String.valueOf(sb.charAt(i)));
        }
        return res;
    }

    public int[] reversePrint2(ListNode head) {
        //先获取链表长度，创建对应长度数组
        ListNode currNode = head;
        int len = 0;
        while(currNode != null){
            len ++;
            currNode = currNode.next;
        }
        int[] result = new int[len];

        //再次遍历链表，将值倒序填充至结果数组
        currNode = head;
        while(currNode != null){
            result[len - 1] = currNode.val;
            len --;
            currNode = currNode.next;
        }
        return result;
    }


    public static void main(String[] args) {
        ListNode head= new ListNode(1);
        head.next = new ListNode(2);
        ListNode next= head.next;
        next.next = new ListNode(3);
        S_06 s = new S_06();
        System.out.println(s.reversePrint(head)[0]);
        System.out.println(s.reversePrint(head)[1]);
        System.out.println(s.reversePrint(head)[2]);
    }
}
