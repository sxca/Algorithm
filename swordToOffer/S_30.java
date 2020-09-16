import java.util.Stack;

public class S_30 {
    /** initialize your data structure here. */
    Stack<Integer> a;
    Stack<Integer> b;
    public S_30() {
        a = new Stack<>();
        b = new Stack<>();
    }

    public void push(int x) {
        a.push(x);
        if (b.empty() || b.peek() >= x) {
            b.push(x);
        }
    }

    public void pop() {
        int temp = a.pop();
        if (temp == b.peek()) {
            b.pop();
        }
    }

    public int top() {
        return a.peek();
    }

    public int min() {
        return b.peek();
    }
}
