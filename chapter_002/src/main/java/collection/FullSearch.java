package collection;

import java.util.HashSet;
import java.util.List;

public class FullSearch {
    public static HashSet<String> extractNumber(List<TaskCollection> list) {
        HashSet<String> numbers = new HashSet<>();
        for (TaskCollection iterator:list
             ) {
            numbers.add(iterator.getNumber());
        }
        return numbers;
    }
}
