package collection;

import java.util.Comparator;

public class StringDownComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        String o1BeforeSlash;
        String o2BeforeSlash;
        if (o1.contains("/")) {
            o1BeforeSlash = o1.substring(0, o1.indexOf("/"));
        } else {
            o1BeforeSlash = o1;
        }
        if (o2.contains("/")) {
            o2BeforeSlash = o2.substring(0, o2.indexOf("/"));
        } else {
            o2BeforeSlash = o2;
        }
        int result = o2BeforeSlash.compareTo(o1BeforeSlash);
        return result == 0 ? o1.compareTo(o2) : result;
    }
}
