public class S_44 {
    public int findNthDigit(int n) {
        if (n == 0) {
            return 0;
        }
        long digit = 1;
        long num = 9;
        long count = digit * num;
        long start = 1;
        while (n > count) {
            n -= count;
            digit++;
            num *= 10;
            count = digit * num;
            start = start * 10;
        }
        long res = (n - 1) / digit;
        int d = (int)((n - 1) % digit);
        res = start + res;
        return new Long(res).toString().charAt(d)-'0';
    }

    public static void main(String[] args) {
        System.out.println(new S_44().findNthDigit(11));
        System.out.println(new S_44().findNthDigit(3));
    }
}
