package sort;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        Integer leftNumber = Integer.parseInt(left.substring(0, left.indexOf(".")));
        Integer rightNumber = Integer.parseInt(right.substring(0, right.indexOf(".")));
        return leftNumber.compareTo(rightNumber);
    }
}
