package collection;

import java.util.Comparator;

public class StringDownComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        if (o1.contains("/") && o2.contains("/")) {
            if (o1.substring(0, o1.indexOf("/")).equals(o2.substring(0, o2.indexOf("/")))) {
                String first = o1.substring(o1.indexOf("/") + 1);
                String second = o2.substring(o2.indexOf("/") + 1);
                return first.compareTo(second);
            } else {
                String first = o1.substring(o1.indexOf("/") + 1);
                String second = o2.substring(o2.indexOf("/") + 1);
                return second.compareTo(first);
            }
//            return o2.compareTo(o1);
//            //            if (o1.substring(0, o1.indexOf("/"))
////                    .equals(o2.substring(0, o2.indexOf("/")))) {
////
////            } else {
//
        }
        return o2.compareTo(o1);
        }
}
