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
        for (String tm : tmp
             ) {
            for (String dep : deps
                 ) {
                if ((dep.substring(0, dep.indexOf("/")).equals(tm))) {
                    if (dep.contains(tm)) {
                        resalt.add(dep);
                    }
                    resalt.add(tm);
                    //Collections.sort(new ArrayList<>(resalt), new StringLenghtComparator());
                    System.out.println(resalt);
                }
                else {
                    resalt.add(tm);
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
