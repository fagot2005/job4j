package collection;

import java.util.ArrayList;
import java.util.List;

public class ConvertList {
    public static List<Integer> convert(List<int[]> list) {
        List<Integer> rsl = new ArrayList<>();
        //int count = 0;
        for (int[] x : list) {
            for (int y: x
            ) {
                rsl.add(y);
                //count++;
            }
        }
        return rsl;
    }
}
