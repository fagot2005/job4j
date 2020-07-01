package collection;

import java.util.*;

public class Departments {
    public static List<String> fillGaps(List<String> deps) {
        HashSet<String> tmp = new HashSet<>();
        HashSet<String> resalt = new HashSet<>();
        for (String value : deps) {
            String start = "";
            for (String el : value.split("/")) {
                tmp.add(start + el);
            }
        }
        List<String> employeeByValue = new ArrayList<>(tmp);
        Collections.sort(employeeByValue);
        for (String employee : employeeByValue
        ) {
            for (String dep : deps
            ) {
                if ((dep.substring(0, dep.indexOf("/")).equals(employee))) {
                    if (dep.contains(employee)) {
                        resalt.add(dep);
                    } else {
                        resalt.add(employee);
                        //Collections.sort(new ArrayList<>(resalt), new StringLenghtComparator());
                        System.out.println(resalt);
                    }
                }
                else {
                    resalt.add(employee);
                    System.out.println(resalt);
                }
            }
        }

//        List<String> output = new ArrayList<>();
//        for (int i = 0; i < tmp.size(); i++) {
//            output.add(tmp[i] + "/" +tmp[i+1]);
//        }
//        System.out.println(output);

//        System.out.println(tmp);
        //Collections.sort(new ArrayList<>(tmp), new StringLenghtComparator());
        return new ArrayList<>(resalt);
    }

    public static void sortAsc(List<String> orgs) {
        Collections.sort(orgs, new StringLenghtComparator());
    }
}
