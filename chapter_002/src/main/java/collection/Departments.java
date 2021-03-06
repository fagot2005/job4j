package collection;

import java.util.*;

public class Departments {
    public static List<String> fillGaps(List<String> deps) {
        HashSet<String> tmp = new HashSet<>();
        for (String value : deps) {
            String start = "";
            for (String el : value.split("/")) {
                if (start.equals("")) {
                    start = el;
                    tmp.add(start);
                } else {
                    start = start + "/" + el;
                    tmp.add(start);
                }
            }
        }
        List<String> employeeByValue = new ArrayList<>(tmp);
        return new ArrayList<>(employeeByValue);
    }

    public static void sortAsc(List<String> orgs) {
        Collections.sort(orgs, new StringLenghtComparator());
    }

    public static void sortDesc(List<String> orgs) {
        Collections.sort(orgs, new StringDownComparator());
    }
}