public class S_58II {
    public String reverseLeftWords(String s, int n) {
        StringBuilder sb1 = new StringBuilder(s.substring(0,n));
        StringBuilder sb2 = new StringBuilder(s.substring(n));
        sb2.append(sb1);
        return sb2.toString();
    }

    public static void main(String[] args) {
        String s = "abcdefg";

    }
}
