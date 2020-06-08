package collection;

import java.util.HashSet;
import java.util.List;

public class FullSearch {
    public static HashSet<String> extractNumber(List<Task> list) {
        HashSet<String> numbers = new HashSet<>();
        for (Task iterator:list
             ) {
            numbers.add(iterator.getDesc());
        }
        return numbers;
    }
}
