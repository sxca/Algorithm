import java.util.Deque;
import java.util.LinkedList;
import java.util.concurrent.DelayQueue;

public class MaxQueue {
    Deque<Integer> q1;
    Deque<Integer> q2;
    public MaxQueue() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public int max_value() {
        if (q1.isEmpty()) {
            return -1;
        }
        return q2.peekFirst();
    }

    public void push_back(int value) {
        q1.addLast(value);
        while (!q2.isEmpty() && q2.peekLast() < value) {
            q2.removeLast();
        }
        q2.addLast(value);
        q1.addFirst(value);
    }

    public int pop_front() {
        if (q1.isEmpty()) {
            return -1;
        }
        if (q1.peekFirst() == q2.peekFirst()) {
            q2.removeFirst();
        }
        return q1.removeFirst();
    }
}
