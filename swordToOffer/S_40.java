import java.util.Arrays;

/**
 * @author SXC
 * @date 2020/9/22 19:59
 */
public class S_40 {
    public int[] getLeastNumbers(int[] arr, int k) {
        int[] res = new int[k];
        Arrays.sort(arr);
        for (int i = 0; i < k; i++) {
            res[i] = arr[i];
        }
        return res;
    }
}
