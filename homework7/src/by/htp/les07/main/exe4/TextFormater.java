package by.htp.les07.main.exe4;
import by.htp.les07.main.StringUtils;

public class TextFormater {

    public static int counter(String str) {
        str = str.replace("  ", " ");
        String[] array = str.split(" ");
        return array.length;
    }

    public static boolean hasPolindrom(String str) {
        str = str.replace("  ", " ");
        String[] array = str.split(" ");
        for (int i = 0; i < array.length; i++) {
            if (StringUtils.isPalindrome(array[i])){
                return true;
            }
        }
        return false;
    }

}
