public class S_67 {
    public int strToInt(String str) {
        char[] a = str.trim().toCharArray();
        if (a.length == 0) {
            return 0;
        }
        int boundary = Integer.MAX_VALUE / 10;
        int res = 0;
        int sign = 1;
        if (a[0] == '-') {
            sign = -1;
        } else if (a[0] == '+') {
            sign = 1;
        } else if (a[0] >= '0' && a[0] <= '9') {
            res = a[0] - '0';
        } else {
            return 0;
        }
        for (int i = 1; i < a.length; i++) {
            if (a[i] < '0' || a[i] > '9') {
                break;
            }
            if (res > boundary || (res == boundary && a[i] > '7')) {
                // 当a[i]为8的时候，超过int正数的最大值，正好到达负数的最小值
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            res = res * 10 + a[i] - '0';
        }
        return res * sign;
    }

    public static void main(String[] args) {
        System.out.println(new S_67().strToInt("42"));
        System.out.println(new S_67().strToInt("   -42"));
        System.out.println(new S_67().strToInt("4193 with words"));
        System.out.println(new S_67().strToInt("-91283472332"));
    }
}
