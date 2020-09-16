import java.util.Deque;
import java.util.LinkedList;

public class S_09 {
    LinkedList<Integer> stack1;
    LinkedList<Integer> stack2;
    public S_09() {
        stack1 = new LinkedList<>();
        stack2 = new LinkedList<>();
    }

    public void appendTail(int value) {
        stack1.offerLast(value);
    }

    public int deleteHead() {
        if (stack1.size()==0)
            return -1;
        int temp;
        int l = stack1.size();
        for (int i = 0; i < l; i++) {
            temp = stack1.pop();
            stack2.offerLast(temp);
        }
        int res = stack2.pop();
        l = stack2.size();
        for (int i = 0; i < l; i++) {
            temp = stack2.pop();
            stack1.offerLast(temp);
        }
        return res;
    }

    public static void main(String[] args) {
        S_09 s = new S_09();
        s.appendTail(3);
        System.out.println(s.deleteHead());
        System.out.println(s.deleteHead());
    }

}
