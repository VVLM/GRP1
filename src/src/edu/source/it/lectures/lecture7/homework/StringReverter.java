package src.edu.source.it.lectures.lecture7.homework;

/**
 * Created by VVLM on 27.03.2017.
 */
public class StringReverter {
    public static String revert(String string) {
        if (string == null || string.length() < 2) {
            return string;
        }
        String rev = " ";
        int len = string.length();
         for (int i = len - 1;i >= 0; i--)
            rev = rev + string.charAt(i);
         return rev;
    }
}