package collection;

import java.util.*;

public class Departments {
    public static List<String> fillGaps(List<String> deps) {
        HashSet<String> tmp = new HashSet<>();
        //HashSet<String> resalt = new HashSet<>();
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
        //sortAsc(employeeByValue);
        //System.out.println(employeeByValue);
        sortDesc(employeeByValue);
        //System.out.println(employeeByValue);
        return new ArrayList<>(employeeByValue);
    }

    public static void sortAsc(List<String> orgs) {
        Collections.sort(orgs, new StringLenghtComparator());
    }

    public static void sortDesc(List<String> orgs) {
        List<String> first = new ArrayList<>();
        List<String> second = new ArrayList<>();
        for (String str: orgs
        ) {
            if (str.contains("/")) {
                first.add(str.substring(0, str.indexOf("/")));
                second.add(str.substring(str.indexOf("/") + 1));
            } else {
                first.add(str);
                second.add("");
            }
        }
        System.out.println(orgs);
        System.out.println(first);
        System.out.println(second);
//        Collections.sort(orgs, new StringDownComparator());
        //Collections.sort(first, new StringLenghtComparator());
        //Collections.sort(orgs, new StringDownComparator());
        //System.out.println(orgs);
    }
}