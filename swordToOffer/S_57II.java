import java.util.LinkedList;
import java.util.List;

public class S_57II {
    public int[][] findContinuousSequence(int target) {
        List<int []> lists = new LinkedList<>();
        int i = 0, j = 0;
        int mid = 0;
        while (i <= j || j > target/2 + 1) {
            if (i == j && i != 0) {
                break;
            }
            if (mid < target) {
                j++;
                mid += j;
            } else if (mid > target){
                mid -= i;
                i++;
            } else {
                int[] arr = new int[j- i + 1];
                int t = 0;
                for (int k = i; k <= j; k++) {
                    arr[t++] = k;
                }
                lists.add(arr);
            }
        }
        return lists.toArray(new int[0][]);
    }
}
