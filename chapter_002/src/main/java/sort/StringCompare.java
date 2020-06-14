package sort;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        int resalt = 0;
        if (o1.length() > o2.length()) {
            return 1;
        } else if (o1.length() < o2.length()) {
            return -1;
        } else {
            for (int i = 0; i < Math.max(o1.length(), o2.length()); i++) {
                if (o1.charAt(i) == o2.charAt(i)) {
                    resalt = 0;
                } else if (o1.charAt(i) > o2.charAt(i)) {
                    resalt = 1;
                    break;
                } else {
                    resalt = -1;
                    break;
                }
            } return resalt;
        }
//
//        if (o1.length() == o2.length()) {
//
//        } else
    }
}
