import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author SXC
 * @date 2020/9/19 9:42
 */
public class S_38 {
    public String[] permutation(String s) {
        List<String> res = new LinkedList<>();
        char[] a = s.toCharArray();
        Arrays.sort(a);
        boolean[] visited = new boolean[a.length];
        StringBuffer track = new StringBuffer();
        dfs(a, visited, res, track);
        return res.toArray(new String[1]);
    }

    void dfs(char[] a, boolean[] visited, List<String> res, StringBuffer track) {
        if (track.length() == a.length ) {
            res.add(track.toString());
            return;
        }

        for (int i = 0; i < a.length; i++) {
            if (visited[i]) {
                continue;
            }

            if (i > 0 && !visited[i-1] && a[i - 1] == a[i]) {
                continue;
            }
            visited[i] = true;
            track.append(a[i]);
            dfs(a, visited, res, track);
            track.deleteCharAt(track.length()-1);
            visited[i] = false;
        }
    }

    public static void main(String[] args) {
        String s = "aab";
        System.out.println(new S_38().permutation(s).length);
    }
}
