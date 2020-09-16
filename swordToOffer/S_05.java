public class S_05 {
    public String replaceSpace(String s) {
        s = s.replaceAll(" ","%20");
        return s;
    }

    public static void main(String[] args) {
        String string = "We are happy.";
        S_05 s = new S_05();
        System.out.println(s.replaceSpace(string));
    }
}
