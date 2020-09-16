public class S_20 {
    public boolean isNumber(String s) {
        if (isInteger(s)) {
            return true;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < '0' || s.charAt(i) > '9') {
                if (s.charAt(i) != 'e' && s.charAt(i) != 'E' && s.charAt(i) != '.') {
                    return false;
                }
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'e' || s.charAt(i) == 'E' || s.charAt(i) == '.') {
                return isInteger(s.substring(0, i)) && isInteger(s.substring(i + 1, s.length()));
            }
        }
        return true;
    }

    private boolean isInteger(String s) {
        if (s.length() == 0)
            return false;
        int l = s.length();
        for (int j = s.length()-1; j >= 0; j--) {
            if (s.charAt(j) == ' ') {
                l--;
            } else {
                break;
            }
        }

        if (l == 0)
            return false;
        int i = 0;
        if (s.charAt(0) == '+' || s.charAt(0) == '-') {
            i = 1;
        }
        for (; i < l; i++) {
            if (s.charAt(i) < '0' || s.charAt(i) > '9') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new S_20().isNumber("5e2"));
        System.out.println(new S_20().isNumber("3.23421"));
        System.out.println(new S_20().isNumber("3.23421"));
        System.out.println(new S_20().isNumber("12e"));
        System.out.println(new S_20().isNumber("1a.879"));
        System.out.println(new S_20().isNumber("+4"));
        System.out.println(new S_20().isNumber("+-4"));
        System.out.println(new S_20().isNumber("1"));
        System.out.println(new S_20().isInteger("1 "));
    }
}
