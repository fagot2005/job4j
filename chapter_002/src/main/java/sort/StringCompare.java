package sort;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        int resalt = -1;
        //int iteration = Math.min(o1.length(), o2.length());
        for (int i = 0; i < Math.min(o1.length(), o2.length()); i++) {
            if (Character.compare(o1.charAt(i), o2.charAt(i)) == 0) {
                resalt = 0;
            } else break;
        }
        if (resalt == 0 && Integer.compare(o1.length(), o2.length()) == 0) {
            resalt = 0;
        } else if (resalt == 0 && Integer.compare(o1.length(), o2.length()) > 0) {
            resalt = 1;
        } else resalt = -1;
//            else if (o1.charAt(i) > o2.charAt(i)) {
//                resalt = 1;
//                break;
//            } else {
//                resalt = -1;
//                break;
//            }
//            int resalt = 0;
//            if (o1.length() > o2.length()) {
//                return 1;
//            } else if (o1.length() < o2.length()) {
//                return -1;
//            } else {
        return resalt;
    }
}
