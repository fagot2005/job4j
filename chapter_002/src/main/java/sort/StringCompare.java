package sort;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        int resalt = -1;
        int strLenght = Math.min(o1.length(), o2.length());
        for (int i = 0; i < strLenght; i++) {
            resalt = Character.compare(o1.charAt(i), o2.charAt(i));
            if (resalt != 0) {
                break;
            }
        }
        return resalt == 0 ? Integer.compare(o1.length(), o2.length()) : resalt;
    }
}
