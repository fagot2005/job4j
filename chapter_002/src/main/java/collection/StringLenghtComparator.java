package collection;

import java.util.Comparator;

public class StringLenghtComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        int first = o1.length();
        int second = o2.length();
        return o2.compareTo(o1);
    }
}