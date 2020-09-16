import java.util.HashMap;
import java.util.Map;

public class S_10_2 {
    private Map<Integer,Integer> map;

    public S_10_2() {
        map = new HashMap<Integer,Integer>();
        map.put(0,1);
        map.put(1,1);
        map.put(2,2);
    }

    public int numWays(int n) {

        if (map.containsKey(n)) {
            return map.get(n);
        }
        int a = numWays(n-1)%1000000008;
        int b = numWays(n-2)%1000000008;
        int res = (a+b)%1000000008;
        map.put(n,res);
        return res;
    }

    public static void main(String[] args) {
        S_10_2 s = new S_10_2();
        System.out.println(s.numWays(7));
    }

}
