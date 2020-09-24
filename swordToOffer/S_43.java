/**
 * @author SXC
 * @date 2020/9/24 9:14
 */
public class S_43 {
    public int countDigitOne(int n) {
        int high, cur, res = 0, digit, low;
        high = n / 10;
        cur = n % 10;
        digit = 1;
        low = 0;
        while (n != 0) {
            if (cur == 0) {
                res += high * digit;
            } else if (cur == 1){
                res += high * digit + low + 1;
            } else {
                res += (high + 1) * digit;
            }
            low += n % 10;
            n = n / 10;
            high = n / 10;
            cur = n % 10;
            digit *= 10;
        }
        return res;
    }
}
