import java.util.HashMap;
import java.util.Map;

public class S_48 {
    public int lengthOfLongestSubstring(String s) {
        if ("".equals(s)) {
            return 0;
        }
        int[] dp = new int[s.length()];
        dp[0] = 1;
        int max = 1;
        int start = 0;
        Map<Character, Integer> map = new HashMap<>();
        map.put(s.charAt(0), 0);
        for (int i = 1; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), i);
                dp[i] = dp[i-1] + 1;
            } else {
                int before = map.get(s.charAt(i));
                for (int j = start; j <= before; j++) {
                    map.remove(s.charAt(j));
                }
                map.put(s.charAt(i), i);
                start = before + 1;
                dp[i] = i - before;
            }
            if (max < dp[i]) {
                max = dp[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(new S_48().lengthOfLongestSubstring(s));

        Map<Character, Integer> map = new HashMap<>();
        map.put('c',100);
        map.put('c',200);
        System.out.println(map.get('c'));
    }
}
