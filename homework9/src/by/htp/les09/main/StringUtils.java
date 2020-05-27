package by.htp.les09.main;

public class StringUtils {

    public static String reverse(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        return stringBuilder.reverse().toString();
    }

    public static boolean isPalindrome(String s) {
        if (s.length() > 1){
            return s.equals(reverse(s));
        }
        return false;
    }
}
