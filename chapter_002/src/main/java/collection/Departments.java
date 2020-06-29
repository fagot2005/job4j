package collection;

import java.util.*;

public class Departments {
    public static List<String> fillGaps(List<String> deps) {
        HashSet<String> tmp = new HashSet<>();
        for (String value : deps) {
            String start = "";
            for (String el : value.split("/")) {
                tmp.add(start + "/" + el);
            }
        }

        Collections.sort(new ArrayList<>(tmp), new StringLenghtComparator());
        System.out.println(tmp);
        //Collections.sort(new ArrayList<>(tmp), new StringLenghtComparator());
        return new ArrayList<>(tmp);
    }

    public static void sortAsc(List<String> orgs) {
        Collections.sort(orgs, new StringLenghtComparator());
    }

//    public static void sortDesc(List<String> orgs) {
//        Collections.sort(orgs, Collections.reverseOrder());
//
//    }

}
