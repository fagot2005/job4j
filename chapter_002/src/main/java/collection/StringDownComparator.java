package collection;

import java.util.Comparator;

public class StringDownComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        String[] splitO1 = o1.split("/");
        String[] splitO2 = o2.split("/");
        int result = splitO2[0].compareTo(splitO1[0]);
        return result == 0 ? o1.compareTo(o2) : result;
    }
}
