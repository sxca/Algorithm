import java.util.*;

/**
 * @author SXC
 * @date 2020/9/22 20:15
 */
public class S_41 {
    Queue<Integer> a,b;
    public S_41(){
        a = new PriorityQueue<>();
        b = new PriorityQueue<>((x, y) -> (y - x));
    }

    public void addNum(int num) {
        // 相等放左边，不相等放右边
        if (a.size() == b.size()) {
            b.add(num);
            a.add(b.poll());
        } else {
            a.add(num);
            b.add(a.poll());
        }
    }

    public double findMedian() {
        if (a.size() == b.size()) {
            return (a.peek() + b.peek()) / 2.0;
        } else {
          return a.peek();
        }
    }
}
