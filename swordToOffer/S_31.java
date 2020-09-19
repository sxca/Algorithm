import java.util.Stack;

public class S_31 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> s = new Stack<>();
        int i = 0, l = pushed.length;
        for (int j = 0; j < l; j++) {
            if (s.isEmpty()) {
                s.push(pushed[i++]);
            }
            if (s.peek() == popped[i]) {
                s.pop();
                continue;
            }
            while (i < l) {
                s.push(pushed[i++]);
            }
            if (i >= l) {
                return false;
            }
        }
        return true;
    }

    
}
