public class S_65 {
    public int add(int a, int b) {
        int res;
        res = a ^ b;
        int temp = a & b;
        temp <<= 1;
        return res + temp;
    }

    public static void main(String[] args) {
        System.out.println(new S_65().add(5,11));
        System.out.println(new S_65().add(5,6));
    }
}
