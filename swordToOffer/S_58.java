public class S_58 {
    public String reverseWords(String s) {
        String[] b = s.split(" +");
        String res = "";
        int start = 1;
        for (int i = b.length -1; i >= 0; i--) {
            if ("".equals(b[i])) {
                continue;
            }
            if (start == 1) {
                res += b[i];
                start = 0;
            } else {
                res += " " + b[i];
            }
        }
        return res;
    }


    public static void main(String[] args) {
        String a = "  hello   world!  ";
        String[] b = a.split(" +");
        System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(b[2]);

        StringBuilder sb = new StringBuilder("hello");
        sb.reverse();
        System.out.println(sb);

        System.out.println(new S_58().reverseWords(" hello   world! "));
    }
}
